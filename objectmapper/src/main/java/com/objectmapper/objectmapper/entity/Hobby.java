package com.objectmapper.objectmapper.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hobby;
}
