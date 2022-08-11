package com.example.demo.service;

import com.example.demo.entity.RoleEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.exceptions.UserAlreadyExist;
import com.example.demo.model.UserModel;
import com.example.demo.repository.RoleRepo;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleService roleService;


    public UserModel createUser(UserEntity user) {
//        if (userRepo.findByUsername(user.getEmail())!=null) {
//            throw new UserAlreadyExist("Пользователь с таким email уже существует");
//        }
//
//        UserEntity newUser = userRepo.save(user);
//        RoleEntity role = roleService.getRoleByValue("USER");
//        newUser.setRoles(Collections.singletonList(role));
//
//        return newUser;
        RoleEntity role = roleService.getRoleByValue("USER");
        user.setRoles(Collections.singletonList(role));
        return UserModel.userModel(userRepo.save(user));
    }

    public List<UserEntity> getAllUsers() {
        return Streamable.of(userRepo.findAll()).toList();
    }
}
