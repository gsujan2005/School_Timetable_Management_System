package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
