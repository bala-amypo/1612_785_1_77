package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.example.demo.entity.AssessmentResult;
import com.example.demo.repository.AssessmentResultRepository;
import com.example.demo.service.AssessmentResultService;

@Service
public class AssessmentResultServiceImpl implements AssessmentResultService {

    private final AssessmentResultRepository assessmentResultRepository;

    public AssessmentResultServiceImpl(AssessmentResultRepository assessmentResultRepository) {
        this.assessmentResultRepository = assessmentResultRepository;
    }

    @Override
    public AssessmentResult recordResult(AssessmentmentResult result) {

        // Validate score
        Assert.notNull(result, "Assessment result must not be null");
        Assert.notNull(result.getScore(), "Score must not be null");

        if (result.getScore() < 0 || result.getScore() > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }

        return assessmentResultRepository.save(result);
    }

    @Override
    public List<AssessmentResult> getResultsByStudent(Long studentId) {
        return assessmentResultRepository.findByStudentId(studentId);
    }

    @Override
    public List<AssessmentResult> getResultsByStudentAndSkill(Long studentId, Long skillId) {
        return assessmentResultRepository.findByStudentIdAndSkillId(studentId, skillId);
    }
}
