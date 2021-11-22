package com.barisertakus.aibasedhealthapp.controller;

import com.barisertakus.aibasedhealthapp.dto.LoginRequest;
import com.barisertakus.aibasedhealthapp.dto.SignupRequest;
import com.barisertakus.aibasedhealthapp.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/auth")
@CrossOrigin
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@Valid @RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authService.authenticate(loginRequest));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> register(@Valid @RequestBody SignupRequest signupRequest){
        return authService.register(signupRequest);
    }

}
