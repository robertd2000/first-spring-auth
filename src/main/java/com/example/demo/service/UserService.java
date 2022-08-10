package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.exceptions.UserAlreadyExist;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    public UserEntity createUser(UserEntity user) {
//        if (userRepo.findByUsername(user.getEmail())!=null) {
//            throw new UserAlreadyExist("Пользователь с таким email уже существует");
//        }

        return userRepo.save(user);
    }

    public List<UserEntity> getAllUsers() {
        return Streamable.of(userRepo.findAll()).toList();
    }
}
