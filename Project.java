package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROJECTS")
public class Project {
    @Id
    private Long id;
    private String name;
    private String description;

    // Getters and Setters
}
