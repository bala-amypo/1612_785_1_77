// package com.example.demo.serviceimpl;

// import com.example.demo.entity.Skill;
// import com.example.demo.repository.SkillRepository;
// import com.example.demo.service.SkillService;
// import org.springframework.stereotype.Service;
// import java.util.List;

// @Service
// public class SkillServiceImpl implements SkillService {
//     private final SkillRepository repository;

//     public SkillServiceImpl(SkillRepository repository) {
//         this.repository = repository;
//     }

//     @Override
//     public Skill createSkill(Skill skill) {
//         if (repository.findByCode(skill.getCode()).isPresent()) {
//             throw new IllegalArgumentException("Code must be unique");
//         }
//         return repository.save(skill);
//     }

//     @Override
//     public Skill updateSkill(Long id, Skill skill) {
//         if (!repository.findById(id).isPresent()) {
//             throw new RuntimeException("Skill not found");
//         }
//         skill.setId(id);
//         return repository.save(skill);
//     }

//     @Override
//     public Skill getById(Long id) {
//         return repository.findById(id)
//             .orElseThrow(() -> new RuntimeException("Skill not found"));
//     }

//     @Override
//     public List<Skill> getActiveSkills() {
//         return repository.findByActiveTrue();
//     }
// }
package com.example.demo.serviceimpl;

import com.example.demo.entity.Skill;
import com.example.demo.repository.SkillRepository;
import com.example.demo.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {
    private final SkillRepository skillRepository;

    @Override
    public Skill createSkill(Skill skill) {
        if (skillRepository.findByCode(skill.getCode()).isPresent()) {
            throw new IllegalArgumentException("Skill code must be unique");
        }
        return skillRepository.save(skill);
    }

    @Override
    public Skill updateSkill(Long id, Skill skill) {
        if (!skillRepository.existsById(id)) {
            throw new RuntimeException("Skill not found");
        }
        skill.setId(id);
        return skillRepository.save(skill);
    }

    @Override
    public Skill getById(Long id) {
        return skillRepository.findById(id).orElseThrow(() -> new RuntimeException("Skill not found"));
    }

    @Override
    public List<Skill> getActiveSkills() {
        return skillRepository.findByActiveTrue();
    }
}
