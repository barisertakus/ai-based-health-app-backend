package com.barisertakus.aibasedhealthapp.controller;

import com.barisertakus.aibasedhealthapp.dto.GoogleUserDTO;
import com.barisertakus.aibasedhealthapp.service.GoogleUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/googleUser")
@CrossOrigin
public class GoogleUserController {
    private final GoogleUserService googleUserService;

    public GoogleUserController(GoogleUserService googleUserService) {
        this.googleUserService = googleUserService;
    }

    @PostMapping("/save")
    public ResponseEntity<Boolean> saveUser(@RequestBody GoogleUserDTO googleUserDTO) {
        return ResponseEntity.ok(googleUserService.saveUser(googleUserDTO));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<GoogleUserDTO>> getAll() {
        return ResponseEntity.ok(googleUserService.getAll());
    }

    @GetMapping("/getById")
    public ResponseEntity<GoogleUserDTO> getById(@RequestParam String id) {
        return ResponseEntity.ok(googleUserService.getById(id));
    }

    @PostMapping("/updateTokenById")
    public ResponseEntity<Boolean> updateTokenById(@RequestParam String id, String expoToken){
        return ResponseEntity.ok(googleUserService.updateTokenById(id, expoToken));
    }
}
