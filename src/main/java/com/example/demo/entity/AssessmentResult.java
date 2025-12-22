package com.example.demo.entity;

public class AssessmentResult {

    private Long id;
    private Long studentId;
    private Long skillId;
    private int score;

    public AssessmentResult() {
    }

    public AssessmentResult(Long id, Long studentId, Long skillId, int score) {
        this.id = id;
        this.studentId = studentId;
        this.skillId = skillId;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public Long getSkillId() {
        return skillId;
    }

    public int getScore() {
        return score;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
