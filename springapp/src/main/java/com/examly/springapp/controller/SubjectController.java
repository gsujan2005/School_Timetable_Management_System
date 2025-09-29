package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.Subject;
import com.examly.springapp.service.SubjectService;

@RestController
@RequestMapping("/api/subjects")
@CrossOrigin(origins = "*")
public class SubjectController {
    @Autowired
    private SubjectService service;

    @PostMapping("/add")
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject){
        return ResponseEntity.ok(service.addSubject(subject));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Subject>> getAllSubjects(){
        return ResponseEntity.ok(service.getAllSubjects());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateSubject(@RequestBody Subject subject, @PathVariable Long id){
        return ResponseEntity.ok(service.updateSubject(subject, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSubject(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteSubject(id));
    }
}
