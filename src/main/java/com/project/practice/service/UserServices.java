package com.project.practice.service;

import com.project.practice.model.User;
import com.project.practice.repository.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserServices
{
    @Autowired
    private UserRepositories userRepo;

    public List<User> getAllUser() {
        return (List<User>) userRepo.findAll();
    }

    public Optional<User> getUserByEmail(String email)
    {
        return userRepo.findUserByEmail(email);
    }

    public void deleteUser(int id)
    {
        userRepo.deleteById(id);
    }

    public void addUser(User user)
    {
        userRepo.save(user);
    }
}

