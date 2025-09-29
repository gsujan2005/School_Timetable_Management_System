package com.examly.springapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Teacher;
import com.examly.springapp.repository.TeacherRepository;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository repo;

    public Teacher addTeacher(Teacher teacher) {
        return repo.save(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return repo.findAll();
    }

    public String updateTeacher(Teacher teacher, Long id) {
        if (repo.existsById(id)) {
            repo.save(teacher);
            return "Teacher Updated Successfully";
        }
        return "Teacher not found";
    }

    public String deleteTeacher(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Teacher Deleted Successfully";
        }
        return "Teacher not found";
    }
}
