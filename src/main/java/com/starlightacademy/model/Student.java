package com.starlightacademy.model;

import java.util.ArrayList;

public class Student
{
    private String name;
    private String gender;
    private String designatedClass;
    private int age;
    private String id;
    private int strikeCount;


    public Student(String name, String gender, String designatedClass, int age, String id, int strikeCount)
    {
        this.name = name;
        this.gender = gender;
        this.designatedClass = designatedClass;
        this.age = age;
        this.id = id;
        this.strikeCount = strikeCount;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getDesignatedClass()
    {
        return designatedClass;
    }
    public void setDesignatedClass(String designatedClass)
    {
        this.designatedClass = designatedClass;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    public int getStrikeCount()
    {
        return strikeCount;
    }
    public void setStrikeCount(int strikeCount)
    {
        this.strikeCount = strikeCount;
    }

    public ArrayList<String> canLearn(ArrayList<String> subject){
        return subject;
    }
}
