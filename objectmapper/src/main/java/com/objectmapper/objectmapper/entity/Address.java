package com.objectmapper.objectmapper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.java.Log;

@Entity
@Table
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;

}
