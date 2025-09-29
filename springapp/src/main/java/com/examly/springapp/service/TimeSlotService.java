package com.examly.springapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.TimeSlot;
import com.examly.springapp.repository.TimeSlotRepository;

@Service
public class TimeSlotService {
    @Autowired
    private TimeSlotRepository repo;

    public TimeSlot addTimeSlot(TimeSlot timeSlot) {
        return repo.save(timeSlot);
    }

    public List<TimeSlot> getAllTimeSlots() {
        return repo.findAll();
    }

    public String updateTimeSlot(TimeSlot timeSlot, Long id) {
        if (repo.existsById(id)) {
            repo.save(timeSlot);
            return "TimeSlot Updated Successfully";
        }
        return "TimeSlot not found";
    }

    public String deleteTimeSlot(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "TimeSlot Deleted Successfully";
        }
        return "TimeSlot not found";
    }
}
