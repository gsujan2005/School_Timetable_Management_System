package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.model.ScheduleEntry;
import com.examly.springapp.service.ScheduleService;

@RestController
@RequestMapping("/api/schedule")
@CrossOrigin(origins = "*")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    
    @PostMapping("/add")
    public ResponseEntity<ScheduleEntry> addSchedule(@RequestBody ScheduleEntry scheduleEntry) {
        ScheduleEntry savedEntry = scheduleService.addSchedule(scheduleEntry);
        return ResponseEntity.ok(savedEntry); 
    }

    
    @GetMapping("/all")
    public ResponseEntity<List<ScheduleEntry>> getAllSchedules() {
        List<ScheduleEntry> schedules = scheduleService.getAllSchedules();
        return ResponseEntity.ok(schedules); 
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<String> updateEntry(@RequestBody ScheduleEntry scheduleEntry, @PathVariable Long id) {
        String result = scheduleService.updateEntry(scheduleEntry, id);
        return ResponseEntity.ok(result);
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEntry(@PathVariable Long id) {
        String result = scheduleService.deleteEntry(id);
        return ResponseEntity.ok(result);
    }
}
