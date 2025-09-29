package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.Student;
import com.examly.springapp.service.StudentService;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return ResponseEntity.ok(service.addStudent(student));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(service.getAllStudents());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateStudent(@RequestBody Student student, @PathVariable Long id){
        return ResponseEntity.ok(service.updateStudent(student, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteStudent(id));
    }
}
