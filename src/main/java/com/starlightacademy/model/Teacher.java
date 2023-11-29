package com.starlightacademy.model;
public class Teacher extends Staff {

    private String role;

    public Teacher(String firstName, String lastName, int phoneNumber, String email, int age, String id, String role) {
        super(firstName, lastName, phoneNumber, email, age, id);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}