package com.examly.springapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.User;
import com.examly.springapp.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User addUser(User user) {
        return repo.save(user);
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public String updateUser(User user, Long id) {
        if (repo.existsById(id)) {
            repo.save(user);
            return "User Updated Successfully";
        }
        return "User not found";
    }

    public String deleteUser(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "User Deleted Successfully";
        }
        return "User not found";
    }
}
