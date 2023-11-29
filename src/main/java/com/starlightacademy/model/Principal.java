package com.starlightacademy.model;

public class Principal extends Staff{

    private String position;

    public Principal(String firstName, String lastName, int phoneNumber, String email, int age, String id, String position) {
        super(firstName, lastName, phoneNumber, email, age, id);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
