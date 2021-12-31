package com.barisertakus.aibasedhealthapp.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class GoogleUserDTO {
    @Id
    private String id;
    private String email;
    private String family_name;
    private String given_name;
    private String locale;
    private String name;
    private String picture;
    private Boolean verified_email;
    private String expoNotificationToken;

}
