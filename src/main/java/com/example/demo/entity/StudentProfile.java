package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    private User user;

    @Column(unique = true, nullable = false)
    private String enrollmentId;

    private String cohort;
    private Integer yearLevel;
    private Boolean active = true;

    private Instant lastUpdatedAt;

    @PreUpdate
    public void updateTime() {
        this.lastUpdatedAt = Instant.now();
    }

    // getters & setters
}
