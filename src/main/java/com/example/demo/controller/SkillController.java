package com.example.demo.controller;

import com.example.demo.entity.Skill;
import com.example.demo.service.SkillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    private final SkillService Service;

    public SkillController(SkillService Service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Skill> create(@RequestBody Skill skill) {
        return ResponseEntity.ok(Service.createSkill(skill));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Skill> update(@PathVariable Long id, @RequestBody Skill skill) {
        return ResponseEntity.ok(Service.updateSkill(id, skill));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Skill> get(@PathVariable Long id) {
        return ResponseEntity.ok(Service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<Skill>> getAll() {
        return ResponseEntity.ok(service.getAllSkills());
    }

    @PutMapping("/{id}/deactivate")
    public ResponseEntity<Void> deactivate(@PathVariable Long id) {
        service.deactivateSkill(id);
        return ResponseEntity.ok().build();
    }
}
