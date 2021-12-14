package com.podsync.podsync.controllers;

import java.util.List;

import com.podsync.podsync.model.User;
import com.podsync.podsync.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/{id}")
  public User GetUser(@PathVariable("id") long id) {
    var userFound = userRepository.findById(id);
    return userFound.isPresent() ? userFound.get() : null;
  }

  @PostMapping("")
  public User CreateUser(@RequestBody User user) {
    userRepository.save(user);
    return user;
  }

  @GetMapping("/list")
  public List<User> ListUsers() {
    return userRepository.findAll();
  }

}
