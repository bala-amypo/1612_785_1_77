// package com.example.demo.serviceimpl;

// import com.example.demo.entity.AssessmentResult;
// import com.example.demo.repository.AssessmentResultRepository;
// import com.example.demo.service.AssessmentResultService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class AssessmentResultServiceImpl implements AssessmentResultService {

//     @Autowired
//     private AssessmentResultRepository repository;

//     @Override
//     public AssessmentResult recordAssessment(AssessmentResult result) {
//         return repository.save(result);
//     }

//     @Override
//     public List<AssessmentResult> getResultsByStudent(Long studentId) {
//         return repository.findByStudentId(studentId);
//     }

//     @Override
//     public List<AssessmentResult> getResultsByStudentAndSkill(Long studentId, Long skillId) {
//         return repository.findByStudentIdAndSkillId(studentId, skillId);
//     }
// }
package com.example.demo.serviceimpl;

import com.example.demo.entity.AssessmentResult;
import com.example.demo.repository.AssessmentResultRepository;
import com.example.demo.service.AssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssessmentServiceImpl implements AssessmentService {
    private final AssessmentResultRepository assessmentResultRepository;

    @Override
    public AssessmentResult recordAssessment(AssessmentResult result) {
        if (result.getScore() == null || result.getScore() < 0 || result.getScore() > result.getMaxScore()) {
            throw new IllegalArgumentException("Score must be between 0 and maxScore");
        }
        return assessmentResultRepository.save(result);
    }
}
