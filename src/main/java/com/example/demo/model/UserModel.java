package com.example.demo.model;

import com.example.demo.entity.RoleEntity;
import com.example.demo.entity.UserEntity;

public class UserModel {
    private Long id;
    private String email;
    private String password;
    private Boolean banned;
    private String banReason;

    public static UserModel userModel(UserEntity entity) {
        UserModel model  = new UserModel();
        model.setId(entity.getId());
        model.setEmail(entity.getEmail());
        model.setPassword(entity.getPassword());
        model.setBanned(entity.getBanned());
        model.setBanReason(entity.getBanReason());
        return model;
    }

    public UserModel(Long id, String email, String password, Boolean banned, String banReason) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.banned = banned;
        this.banReason = banReason;
    }

    public UserModel(String email, String password, Boolean banned, String banReason) {
        this.email = email;
        this.password = password;
        this.banned = banned;
        this.banReason = banReason;
    }

    public UserModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public String getBanReason() {
        return banReason;
    }

    public void setBanReason(String banReason) {
        this.banReason = banReason;
    }
}
