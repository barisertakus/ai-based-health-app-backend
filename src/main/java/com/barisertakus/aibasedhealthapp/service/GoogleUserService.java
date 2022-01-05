package com.barisertakus.aibasedhealthapp.service;

import com.barisertakus.aibasedhealthapp.dto.GoogleUserDTO;

import java.util.List;

public interface GoogleUserService {
    GoogleUserDTO saveUser(GoogleUserDTO googleUser);
    List<GoogleUserDTO> getAll();
    GoogleUserDTO getById(String id);
    Boolean updateTokenById(String id, String expoToken);
    Boolean deleteByEmail(String email);
}
