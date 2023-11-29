package com.starlightacademy.serviceImp;

import com.starlightacademy.model.Student;
import com.starlightacademy.services.TeacherServices;


public class TeacherServiceImp implements TeacherServices {

    @Override
    public void teach(Student student) {
        if (student.getDesignatedClass() == "SS1A") {
            System.out.println("Subjects: " + "Mathematics," + " " + "English," + " " + "General Science");
        } else if (student.getDesignatedClass() == "SS1B") {
            System.out.println("Subject: " + "Mathematics" + " " + "English" + " " + "Accounting");
        }
        else if (student.getDesignatedClass() == "SS1C") {
            System.out.println("Subject: " + "Mathematics" + " " + "English" + " " + "Government");
        }
        else {
            System.out.println("Subject: " + "Mathematics" + " " + "English" + " " + "Other Subjects");
        }
    }
}