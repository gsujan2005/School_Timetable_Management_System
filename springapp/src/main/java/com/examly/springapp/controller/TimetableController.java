package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.Timetable;
import com.examly.springapp.service.TimetableService;

@RestController
@RequestMapping("/api/timetables")
@CrossOrigin(origins = "*")
public class TimetableController {
    @Autowired
    private TimetableService service;

    @PostMapping("/add")
    public ResponseEntity<Timetable> addTimetable(@RequestBody Timetable timetable){
        return ResponseEntity.ok(service.addTimetable(timetable));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Timetable>> getAllTimetables(){
        return ResponseEntity.ok(service.getAllTimetables());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTimetable(@RequestBody Timetable timetable, @PathVariable Long id){
        return ResponseEntity.ok(service.updateTimetable(timetable, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTimetable(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteTimetable(id));
    }
}
