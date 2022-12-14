package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

//https://stackoverflow.com/questions/68688242/spring-boot-jpa-many-to-many-jackson-serialize-each-entity
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
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
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
