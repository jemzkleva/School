package com.starlightacademy.serviceImp;

import com.starlightacademy.model.Applicant;
import com.starlightacademy.model.Student;

public class PrincipalServiceImp {

    public void admit(Applicant applicant) {
        if (applicant.getScore() < 60 || applicant.getAge() < 11 || applicant.getAge() > 18) {
            System.out.printf("Hello %s, you didn't meet the required conditions for the screening\n", applicant.getName());
        } else {
            System.out.printf("Congratulations %s, you have been admitted\n", applicant.getName());
        }
    }

    public void expelStudent(Student student) {
        if (student.getStrikeCount() >= 3) {
            System.out.printf("Hello %s, you are expelled from Star Light Academy\n", student.getName());
        }
        else if (student.getStrikeCount() >= 1 || student.getStrikeCount() < 3) {
            System.out.printf("Dear %s be careful, you are on last warning\n", student.getName());
        }
        else {
            System.out.printf("Dear %s you are a Good Student, keep it up\n", student.getName());
        }


    }
}