package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.Department;
import com.examly.springapp.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
@CrossOrigin(origins = "*")
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @PostMapping("/add")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department){
        return ResponseEntity.ok(service.addDepartment(department));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Department>> getAllDepartments(){
        return ResponseEntity.ok(service.getAllDepartments());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateDepartment(@RequestBody Department department, @PathVariable Long id){
        return ResponseEntity.ok(service.updateDepartment(department, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteDepartment(id));
    }
}
