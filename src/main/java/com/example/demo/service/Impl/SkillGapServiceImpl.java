package com.example.demo.serviceimpl;

import com.example.demo.entity.SkillGapRecord;
import com.example.demo.service.SkillGapService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillGapServiceImpl implements SkillGapService {

    @Override
    public List<SkillGapRecord> computeGaps(Long studentId) {
        return List.of();
    }
}
