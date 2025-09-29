package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long headId;

    public Department() {}

    public Department(Long id, String name, Long headId) {
        this.id = id; this.name = name; this.headId = headId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Long getHeadId() { return headId; }
    public void setHeadId(Long headId) { this.headId = headId; }
}
