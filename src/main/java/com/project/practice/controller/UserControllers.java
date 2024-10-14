package com.project.practice.controller;

import com.project.practice.model.User;
import com.project.practice.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin(origins="http://localhost:8080")
@RequestMapping("/user")
public class UserControllers
{
    @Autowired
    private UserServices userServices;

    @GetMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userServices.getAllUser());
    }

    @GetMapping(value="/email", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserByEmail(@RequestParam(value="email") String email){
        Optional<User> optUser = userServices.getUserByEmail(email);
        return ResponseEntity.ok(optUser.orElse(null));
    }

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addUser(@RequestBody User user)
    {
        userServices.addUser(user);
        return ResponseEntity.ok("OK");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id" )int id)
    {
        userServices.deleteUser(id);
        return ResponseEntity.ok("OK");
    }
}
