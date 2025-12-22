package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private boolean active = true;

    // ✅ REQUIRED: Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {          // ✅ THIS WAS MISSING
        return name;
    }

    public void setName(String name) { // ✅ THIS WAS MISSING
        this.name = name;
    }

    public String getDescription() {   // ✅ REQUIRED
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {         // boolean getter
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
