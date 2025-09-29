package com.examly.springapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Timetable;
import com.examly.springapp.repository.TimetableRepository;

@Service
public class TimetableService {
    @Autowired
    private TimetableRepository repo;

    public Timetable addTimetable(Timetable timetable) {
        return repo.save(timetable);
    }

    public List<Timetable> getAllTimetables() {
        return repo.findAll();
    }

    public String updateTimetable(Timetable timetable, Long id) {
        if (repo.existsById(id)) {
            repo.save(timetable);
            return "Timetable Updated Successfully";
        }
        return "Timetable not found";
    }

    public String deleteTimetable(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Timetable Deleted Successfully";
        }
        return "Timetable not found";
    }
}
