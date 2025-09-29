package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.Class;
import com.examly.springapp.service.ClassService;

@RestController
@RequestMapping("/api/classes")
@CrossOrigin(origins = "*")
public class ClassController {
    @Autowired
    private ClassService service;

    @PostMapping("/add")
    public ResponseEntity<Class> addClass(@RequestBody Class cls){
        return ResponseEntity.ok(service.addClass(cls));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Class>> getAllClasses(){
        return ResponseEntity.ok(service.getAllClasses());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateClass(@RequestBody Class cls, @PathVariable Long id){
        return ResponseEntity.ok(service.updateClass(cls, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClass(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteClass(id));
    }
}
