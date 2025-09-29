package com.examly.springapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Department;
import com.examly.springapp.repository.DepartmentRepository;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repo;

    public Department addDepartment(Department department) {
        return repo.save(department);
    }

    public List<Department> getAllDepartments() {
        return repo.findAll();
    }

    public String updateDepartment(Department department, Long id) {
        if (repo.existsById(id)) {
            repo.save(department);
            return "Department Updated Successfully";
        }
        return "Department not found";
    }

    public String deleteDepartment(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Department Deleted Successfully";
        }
        return "Department not found";
    }
}
