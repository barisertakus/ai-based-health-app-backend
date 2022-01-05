package com.barisertakus.aibasedhealthapp.repository;

import com.barisertakus.aibasedhealthapp.entity.GoogleUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GoogleUserRepository extends JpaRepository<GoogleUser, String> {
    Boolean existsByEmail(String email);
    void deleteByEmail(String email);
}
