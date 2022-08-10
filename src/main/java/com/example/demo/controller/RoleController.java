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
    RoleEntity create(@RequestBody RoleEntity role) {
        return roleService.createRole(role);
    }

    @GetMapping("{value}")
            @ResponseBody
//    RoleEntity getByValue(@RequestParam String value) {
//        return roleService.getRoleByValue(value);
//    }
    String getByValue(@RequestParam String value) {
        return value;
    }
}
