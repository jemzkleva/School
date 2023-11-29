package com.starlightacademy.model;

public class AcademicStaff extends Staff
    {
    private String office;
    private String role;

    public AcademicStaff(String firstName, String lastName, int phoneNumber, String email, int age, String id, String office, String role) {
        super(firstName, lastName, phoneNumber, email, age, id);
        this.office = office;
        this.role = role;
    }

    public String getOffice()
    {
        return office;
    }

    public void setOffice(String office)
    {
        this.office = office;
    }
    public String getRole()
    {
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }

}
