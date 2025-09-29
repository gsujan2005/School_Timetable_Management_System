package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.TimeSlot;
import com.examly.springapp.service.TimeSlotService;

@RestController
@RequestMapping("/api/timeslots")
@CrossOrigin(origins = "*")
public class TimeSlotController {
    @Autowired
    private TimeSlotService service;

    @PostMapping("/add")
    public ResponseEntity<TimeSlot> addTimeSlot(@RequestBody TimeSlot timeSlot){
        return ResponseEntity.ok(service.addTimeSlot(timeSlot));
    }

    @GetMapping("/all")
    public ResponseEntity<List<TimeSlot>> getAllTimeSlots(){
        return ResponseEntity.ok(service.getAllTimeSlots());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTimeSlot(@RequestBody TimeSlot timeSlot, @PathVariable Long id){
        return ResponseEntity.ok(service.updateTimeSlot(timeSlot, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTimeSlot(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteTimeSlot(id));
    }
}
