package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserEntity user) {
//        try {
//            userService.createUser(user);
//            return ResponseEntity.ok("Пользователь успешно сохранен");
//        }catch (Exception e) {
//            return ResponseEntity.badRequest().body("Произошла ошибка");
//        }

        return userService.createUser(user);
    }
}
