package com.example.demo.entity;
import com.example.demo.entity.AssessmentResult;
import jakarta.persistence.*;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class AssessmentResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private StudentProfile studentProfile;

    @ManyToOne(optional = false)
    private Skill skill;

    private String assessmentId;
    private Double score;
    private Double maxScore = 100.0;
    private Instant attemptedAt = Instant.now();

    // getters & setters
}
    