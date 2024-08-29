package com.anhtan.foododering.controller;

import com.anhtan.foododering.model.User;
import com.anhtan.foododering.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class SuperAdminController {
    @Autowired
    private UserService userService;

    @GetMapping("/api/customers")
    public ResponseEntity<List<User>> getAllCustomers() {

        List<User> users =userService.findAllUsers();

        return new ResponseEntity<>(users, HttpStatus.ACCEPTED);

    }

    @GetMapping("/api/pending-customers")
    public ResponseEntity<List<User>> getPendingRestaurantUser(){
        List<User> users=userService.getPendingRestaurantOwner();
        return new ResponseEntity<List<User>>(users,HttpStatus.ACCEPTED);

    }
}
