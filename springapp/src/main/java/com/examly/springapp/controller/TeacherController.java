package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.Teacher;
import com.examly.springapp.service.TeacherService;

@RestController
@RequestMapping("/api/teachers")
@CrossOrigin(origins = "*")
public class TeacherController {
    @Autowired
    private TeacherService service;

    @PostMapping("/add")
    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher){
        return ResponseEntity.ok(service.addTeacher(teacher));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Teacher>> getAllTeachers(){
        return ResponseEntity.ok(service.getAllTeachers());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTeacher(@RequestBody Teacher teacher, @PathVariable Long id){
        return ResponseEntity.ok(service.updateTeacher(teacher, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTeacher(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteTeacher(id));
    }
}
