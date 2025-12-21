package com.example.demo.serviceimpl;

import com.example.demo.entity.AssessmentResult;
import com.example.demo.service.AssessmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentServiceImpl implements AssessmentService {

    @Override
    public AssessmentResult recordAssessment(AssessmentResult result) {
        return result;
    }

    @Override
    public List<AssessmentResult> getResultsByStudent(Long studentId) {
        return List.of();
    }

    @Override
    public List<AssessmentResult> getResultsByStudentAndSkill(Long studentId, Long skillId) {
        return List.of();
    }
}
