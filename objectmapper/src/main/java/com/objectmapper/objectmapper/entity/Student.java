package com.objectmapper.objectmapper.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    Address address;
    @OneToMany(cascade = CascadeType.ALL)
    List<Hobby> hobbies;
}
