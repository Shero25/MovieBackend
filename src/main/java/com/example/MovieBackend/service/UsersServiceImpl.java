package com.example.MovieBackend.service;

import com.example.MovieBackend.entity.Users;
import com.example.MovieBackend.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl  implements UsersService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void saveUsers(Users users) {
        this.usersRepository.save(users);
    }
}
