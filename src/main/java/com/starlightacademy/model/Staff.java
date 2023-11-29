package com.starlightacademy.model;

public abstract class Staff {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private int age;
    private String id;


    public Staff (String firstName, String lastName, int phoneNumber, String email, int age, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
        this.id = id;
    }


    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
}
