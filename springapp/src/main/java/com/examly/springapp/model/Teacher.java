package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String qualification;
    private int maxWorkload;
    private Long departmentId;

    public Teacher() {}

    public Teacher(Long id, String name, String qualification, int maxWorkload, Long departmentId) {
        this.id = id; this.name = name; this.qualification = qualification; this.maxWorkload = maxWorkload; this.departmentId = departmentId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }
    public int getMaxWorkload() { return maxWorkload; }
    public void setMaxWorkload(int maxWorkload) { this.maxWorkload = maxWorkload; }
    public Long getDepartmentId() { return departmentId; }
    public void setDepartmentId(Long departmentId) { this.departmentId = departmentId; }
}
