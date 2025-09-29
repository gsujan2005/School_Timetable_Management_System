package com.examly.springapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Subject;
import com.examly.springapp.repository.SubjectRepository;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository repo;

    public Subject addSubject(Subject subject) {
        return repo.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return repo.findAll();
    }

    public String updateSubject(Subject subject, Long id) {
        if (repo.existsById(id)) {
            repo.save(subject);
            return "Subject Updated Successfully";
        }
        return "Subject not found";
    }

    public String deleteSubject(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Subject Deleted Successfully";
        }
        return "Subject not found";
    }
}
