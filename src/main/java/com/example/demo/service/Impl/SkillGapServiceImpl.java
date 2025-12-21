package com.example.demo.serviceimpl;

import com.example.demo.entity.SkillGapRecord;
import com.example.demo.repository.SkillGapRecordRepository;
import com.example.demo.service.SkillGapService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillGapServiceImpl implements SkillGapService {

    private final SkillGapRecordRepository repo;

    public SkillGapServiceImpl(SkillGapRecordRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<SkillGapRecord> computeGaps(Long studentId) {
        return repo.findByStudentProfileId(studentId);
    }

    @Override
    public List<SkillGapRecord> getGapsByStudent(Long studentId) {
        return repo.findByStudentProfileId(studentId);
    }
}
