package com.barisertakus.aibasedhealthapp.service;

import com.barisertakus.aibasedhealthapp.dto.JwtResponse;
import com.barisertakus.aibasedhealthapp.dto.LoginRequest;
import com.barisertakus.aibasedhealthapp.dto.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    JwtResponse authenticate(LoginRequest loginRequest);

    ResponseEntity<?> register(SignupRequest signupRequest);
}
