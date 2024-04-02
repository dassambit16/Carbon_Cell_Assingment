package com.carbonCell.carbonCell.Service;

import com.carbonCell.carbonCell.Model.User;
import com.carbonCell.carbonCell.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
