package com.example.demo.serviceimpl;

import com.example.demo.entity.Skill;
import com.example.demo.service.SkillService;
import com.example.demo.repository.SkillRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired SkillRepository skillRepository;
    @Override
    public Skill createSkill(Skill skill) {
        return skill;
    }

    @Override
    public Skill updateSkill(Long id, Skill skill) {
        return skill;
    }

   @Override
public Skill getById(Long id) {
    return skillRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Skill not found"));
}

    @Override
    public List<Skill> getAllSkills() {
        return List.of();
    }

    @Override
    public void deactivateSkill(Long id) {}
}
