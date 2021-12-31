package com.barisertakus.aibasedhealthapp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class GoogleUser {
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
