package com.examly.springapp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.repository.ScheduleRepository;
import com.examly.springapp.model.ScheduleEntry;

@Service
public class ScheduleService {
    @Autowired
    ScheduleRepository repo;
    public ScheduleEntry addSchedule(ScheduleEntry entry){
        repo.save(entry);
        return entry;
    }
    public List<ScheduleEntry> getAllSchedules() {
        return repo.findAll();
    }

    public String updateEntry(ScheduleEntry scheduleentry, Long id) {
        if(repo.existsById(id)){
            repo.save(scheduleentry);
            return "Data Updated Successfully";
        }
        else{
            return "Id not found";
        }
    }
    public String deleteEntry(Long id) {
        if(repo.existsById(id)){
            repo.deleteById(id);
            return "Data Deleted Successfully";
        }
        else{
           return "Data not found";
        }
    }
}
