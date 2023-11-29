package com.starlightacademy.model;

public class Applicant {

    private String name;
    private String gender;
    private int score;
    private int age;

    public Applicant(String name, String gender, int score, int age) {
        this.name = name;
        this.gender = gender;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
