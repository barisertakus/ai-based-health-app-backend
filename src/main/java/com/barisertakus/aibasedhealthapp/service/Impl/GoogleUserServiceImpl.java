package com.barisertakus.aibasedhealthapp.service.Impl;

import com.barisertakus.aibasedhealthapp.dto.GoogleUserDTO;
import com.barisertakus.aibasedhealthapp.entity.GoogleUser;
import com.barisertakus.aibasedhealthapp.repository.GoogleUserRepository;
import com.barisertakus.aibasedhealthapp.service.GoogleUserService;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class GoogleUserServiceImpl implements GoogleUserService {
    private final GoogleUserRepository googleUserRepository;
    private final ModelMapper modelMapper;

    public GoogleUserServiceImpl(GoogleUserRepository googleUserRepository, ModelMapper modelMapper) {
        this.googleUserRepository = googleUserRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Boolean saveUser(GoogleUserDTO googleUserDTO) {
        GoogleUser googleUser = modelMapper.map(googleUserDTO, GoogleUser.class);
        googleUserRepository.save(googleUser);
        return true;
    }

    @Override
    public List<GoogleUserDTO> getAll() {
        List<GoogleUser> googleUsers = googleUserRepository.findAll();
        return modelMapper.map(googleUsers, new TypeToken<List<GoogleUserDTO>>(){}.getType());
    }

    @Override
    public GoogleUserDTO getById(String id) {
        Optional<GoogleUser> googleUser = googleUserRepository.findById(id);
        if(googleUser.isPresent()){
            return modelMapper.map(googleUser.get(), GoogleUserDTO.class);
        }
        return null;
    }

    @Override
    public Boolean updateTokenById(String id, String expoToken) {
        log.info("updateTokenById started with id : {} , expoToken : {}",id,expoToken);
        Optional<GoogleUser> googleUser = googleUserRepository.findById(id);
        if(googleUser.isPresent()){
            googleUser.get().setExpoNotificationToken(expoToken);
            log.info("updateTokenById finished with : {}",true);
            return true;
        }
        return false;
    }
}
