package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class SkillGapRecommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private StudentProfile studentProfile;

    @ManyToOne
    private Skill skill;

    private String recommendedAction;
    private String priority;
    private Double gapScore;
    private String generatedBy;
    private Instant generatedAt = Instant.now();

    // getters & setters
}
