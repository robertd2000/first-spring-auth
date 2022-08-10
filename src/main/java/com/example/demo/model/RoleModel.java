package com.example.demo.model;

public class RoleModel {
    private Long id;
    private String value;
    private String description;

    public RoleModel(Long id, String value, String description) {
        this.id = id;
        this.value = value;
        this.description = description;
    }

    public RoleModel(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public RoleModel() {
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
