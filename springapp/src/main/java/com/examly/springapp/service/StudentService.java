package com.examly.springapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Student;
import com.examly.springapp.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public String updateStudent(Student student, Long id) {
        if (repo.existsById(id)) {
            repo.save(student);
            return "Student Updated Successfully";
        }
        return "Student not found";
    }

    public String deleteStudent(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Student Deleted Successfully";
        }
        return "Student not found";
    }
}
