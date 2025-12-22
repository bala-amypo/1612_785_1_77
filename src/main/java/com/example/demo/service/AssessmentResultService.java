package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.AssessmentResult;

public interface AssessmentResultService {

    AssessmentResult recordResult(AssessmentResult result);

    List<AssessmentResult> getResultsByStudent(Long studentId);

    List<AssessmentResult> getResultsByStudentAndSkill(Long studentId, Long skillId);
}
