package com.example.demo.controller;

import com.example.demo.entity.RoleEntity;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping()
    public RoleEntity create(@RequestBody RoleEntity role) {
        return roleService.createRole(role);
    }

    @GetMapping("/{value}")
    public RoleEntity getValue(@PathVariable("value") String value) {
        return roleService.getRoleByValue(value);
    }
}
