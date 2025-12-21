package com.example.demo.repository;

import com.example.demo.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    Optional<Skill> findBySkillName(String skillName);
    List<Skill> findByActiveTrue();
}
