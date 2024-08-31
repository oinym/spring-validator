package com.oinym.valdator.spring_validator.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oinym.valdator.spring_validator.model.User;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/users")
@Validated
public class UserController {
  
  @PostMapping(path = "/get",consumes = "application/json" ,produces = "application/json")
  public User getUser(@Valid @RequestBody User body) {
    User user = new User();
    try {
      user .setName(body.getName());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return user;

  }

}
