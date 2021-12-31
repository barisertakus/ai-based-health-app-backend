package com.barisertakus.aibasedhealthapp.repository;

import com.barisertakus.aibasedhealthapp.entity.GoogleUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoogleUserRepository extends JpaRepository<GoogleUser, String> {
}
