package com.example.demo.service;

import com.example.demo.entity.AssessmentResult;
import org.springframework.stereotype.Service;
 
import java.util.ArrayList;
import java.util.List;

@Service
public interface AssessmentService {

    public final List<AssessmentResult> results = new ArrayList<>();

    
    AssessmentResult recordAssessment(AssessmentResult result) {
        results.add(result);
        return result;
    }

    public List<AssessmentResult> getResultsByStudent(Long studentId) {
        List<AssessmentResult> filtered = new ArrayList<>();
        for (AssessmentResult r : results) {
            if (r.getStudentId().equals(studentId)) {
                filtered.add(r);
            }
        }
        return filtered;
    }

    public List<AssessmentResult> getResultsByStudentAndSkill(Long studentId, Long skillId) {
        List<AssessmentResult> filtered = new ArrayList<>();
        for (AssessmentResult r : results) {
            if (r.getStudentId().equals(studentId)
                    && r.getSkillId().equals(skillId)) {
                filtered.add(r);
            }
        }
        return filtered;
    }
}
