package com.example.demo.service;

import com.example.demo.entity.RoleEntity;
import com.example.demo.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepo roleRepo;

    public RoleEntity createRole(RoleEntity role) {
        return roleRepo.save(role);
    }

    public RoleEntity getRoleByValue(String value) {
        return roleRepo.findOneByValue(value);
    }
}
