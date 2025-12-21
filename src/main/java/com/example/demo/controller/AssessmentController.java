package com.example.demo.controller;

import com.example.demo.entity.AssessmentResult;
import com.example.demo.service.AssessmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assessments")
public class AssessmentController {

    private final AssessmentService Service;

    public AssessmentController(AssessmentService Service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AssessmentResult> record(@RequestBody AssessmentResult result) {
        return ResponseEntity.ok(Service.recordAssessment(result));
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<AssessmentResult>> getByStudent(@PathVariable Long studentId) {
        return ResponseEntity.ok(Service.getResultsByStudent(studentId));
    }

    @GetMapping("/student/{studentId}/skill/{skillId}")
    public ResponseEntity<List<AssessmentResult>> getByStudentSkill(
            @PathVariable Long studentId,
            @PathVariable Long skillId) {
        return ResponseEntity.ok(service.getResultsByStudentAndSkill(studentId, skillId));
    }
}
