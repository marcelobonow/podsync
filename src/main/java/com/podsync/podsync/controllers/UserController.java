package com.podsync.podsync.controllers;

import com.podsync.podsync.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @GetMapping("")
  public User HelloWorld() {
    var user = new User((long)15, "Teste", "Teste");
    return user;
  }
}
