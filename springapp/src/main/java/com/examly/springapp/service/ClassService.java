package com.examly.springapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Class;
import com.examly.springapp.repository.ClassRepository;

@Service
public class ClassService {
    @Autowired
    private ClassRepository repo;

    public Class addClass(Class cls) {
        return repo.save(cls);
    }

    public List<Class> getAllClasses() {
        return repo.findAll();
    }

    public String updateClass(Class cls, Long id) {
        if (repo.existsById(id)) {
            repo.save(cls);
            return "Class Updated Successfully";
        }
        return "Class not found";
    }

    public String deleteClass(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Class Deleted Successfully";
        }
        return "Class not found";
    }
}
