package com.examly.springapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Room;
import com.examly.springapp.repository.RoomRepository;

@Service
public class RoomService {
    @Autowired
    private RoomRepository repo;

    public Room addRoom(Room room) {
        return repo.save(room);
    }

    public List<Room> getAllRooms() {
        return repo.findAll();
    }

    public String updateRoom(Room room, Long id) {
        if (repo.existsById(id)) {
            repo.save(room);
            return "Room Updated Successfully";
        }
        return "Room not found";
    }

    public String deleteRoom(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Room Deleted Successfully";
        }
        return "Room not found";
    }
}
