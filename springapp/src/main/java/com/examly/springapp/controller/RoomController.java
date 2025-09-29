package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.Room;
import com.examly.springapp.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
@CrossOrigin(origins = "*")
public class RoomController {
    @Autowired
    private RoomService service;

    @PostMapping("/add")
    public ResponseEntity<Room> addRoom(@RequestBody Room room){
        return ResponseEntity.ok(service.addRoom(room));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Room>> getAllRooms(){
        return ResponseEntity.ok(service.getAllRooms());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateRoom(@RequestBody Room room, @PathVariable Long id){
        return ResponseEntity.ok(service.updateRoom(room, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRoom(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteRoom(id));
    }
}
