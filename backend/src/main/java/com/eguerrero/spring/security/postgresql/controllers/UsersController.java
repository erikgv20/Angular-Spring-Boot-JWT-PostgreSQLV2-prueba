package com.eguerrero.spring.security.postgresql.controllers;

import com.eguerrero.spring.security.postgresql.models.User;
import com.eguerrero.spring.security.postgresql.payload.request.SignupRequest;
import com.eguerrero.spring.security.postgresql.repository.UserRepository;
import com.eguerrero.spring.security.postgresql.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UserService service;

    @Autowired
	UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@Valid @RequestBody User model, @PathVariable(value = "id") Long id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(model);
    }


    
}
