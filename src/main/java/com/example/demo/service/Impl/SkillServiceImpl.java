package com.example.demo.serviceimpl;

import com.example.demo.entity.Skill;
import com.example.demo.service.SkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

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
        return null;
    }

    @Override
    public List<Skill> getAllSkills() {
        return List.of();
    }

    @Override
    public void deactivateSkill(Long id) {}
}
