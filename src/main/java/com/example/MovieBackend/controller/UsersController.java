package com.example.MovieBackend.controller;

import com.example.MovieBackend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/users")

public class UsersController {
    @Autowired
    private UsersService usersService;


}
