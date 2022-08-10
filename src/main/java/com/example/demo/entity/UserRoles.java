package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "user-roles")
public class UserRoles {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer roleId;

    private Integer userId;
}
