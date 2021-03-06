package com.barisertakus.aibasedhealthapp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String name;
}
