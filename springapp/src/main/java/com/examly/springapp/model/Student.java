package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long classId;
    private String guardianInfo;

    public Student() {}

    public Student(Long id, String name, Long classId, String guardianInfo) {
        this.id = id; this.name = name; this.classId = classId; this.guardianInfo = guardianInfo;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Long getClassId() { return classId; }
    public void setClassId(Long classId) { this.classId = classId; }
    public String getGuardianInfo() { return guardianInfo; }
    public void setGuardianInfo(String guardianInfo) { this.guardianInfo = guardianInfo; }
}
