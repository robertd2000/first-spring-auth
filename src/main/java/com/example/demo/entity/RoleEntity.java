package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
public class RoleEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String value;

    @Column(nullable = false)
    private String description;

    @ManyToMany()
//    @JoinTable(name = )
    private List<UserEntity> users;

    public RoleEntity(Long id, String value, String description) {
        this.id = id;
        this.value = value;
        this.description = description;
    }

    public RoleEntity(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public RoleEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
