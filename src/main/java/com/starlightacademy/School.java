package com.starlightacademy;

import com.starlightacademy.model.*;
import com.starlightacademy.serviceImp.PrincipalServiceImp;
import com.starlightacademy.serviceImp.StudentServiceImp;
import com.starlightacademy.serviceImp.TeacherServiceImp;

// DECAGON WEEK 0 PROJECT
// You are to model a school using an object-oriented programming (OOP) paradigm.
// A basic school is made up of the following.
//· Principal, Teachers, Staff, Non-Academic Staff, Course, Classes, Applicants

//Each of these players have various functions/actions which they can perform
//· A teacher can teach a course.
//· A student can take a course.
//· The principal can expel a student etc.
//· A principal can admit applicants based on age.


public class School
{

    public static void main(String[] args)
    {

        //Principal phase

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("OFFICE of the PRINCIPAL");
        System.out.println("----------------------------");
        Principal principal = new Principal("Celestina","Joseph",813501227,"amarajos@gmail",45, "SLA001","Principal");
        System.out.println("Position: " + principal.getPosition());
        System.out.println("Name: " + principal.getFirstName() + " " + principal.getLastName());
        System.out.println("ID Number: " + principal.getId());
        System.out.println("----------------------------");

        PrincipalServiceImp principalServiceImp = new PrincipalServiceImp();
        principalServiceImp.admit(new Applicant("Gideon", "Male",65, 13));


        //Teacher phase

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("SS1A CLASS ");
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        Teacher teacher1 = new Teacher("Glory", "James", 234, "glory@gmail", 25, "SLA010", "Class Teacher");
        System.out.println("Position: " + teacher1.getRole());
        System.out.println("Name:" + " " + teacher1.getFirstName() + " " + teacher1.getLastName());
        System.out.println("ID Number:" + " " + teacher1.getId());
        TeacherServiceImp teacherServiceImp = new TeacherServiceImp();
        System.out.println("----------------------------");


        //Academic Staff

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------------");
        AcademicStaff labScientist = new AcademicStaff("Ernest","Henry",234666419,"henerst@gmail", 30,"AS02","Science Laboratory","Laboratory Scientist");
        System.out.println("Name: " + labScientist.getFirstName() + " " + labScientist.getLastName());
        System.out.println("Position: " + labScientist.getRole());
        System.out.println("Office: " + labScientist.getOffice());
        System.out.println("ID Number: " + labScientist.getId());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------------");
        AcademicStaff librarian = new AcademicStaff("Adaobi","Jemmimah",234666419,"henerst@gmail", 30,"AS02","Library","Librarian");
        System.out.println("Name: " + librarian.getFirstName() + " " + librarian.getLastName());
        System.out.println("Position: " + librarian.getRole());
        System.out.println("Office: " + librarian.getOffice());
        System.out.println("ID Number: " + librarian.getId());


//
//
        //Students

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("STUDENT1");
        System.out.println("-------------------------------");
        Student student1 = new Student("Kingsley Samuel","Male","SS1A", 11,"S1",3);
        System.out.println("Name: " + student1.getName());
        System.out.println("ID Number: " + student1.getId());
        System.out.println("Gender: " + student1.getGender());
        System.out.println("Class: " + student1.getDesignatedClass());
        teacherServiceImp.teach(student1);
        System.out.println("Strike Count: " + student1.getStrikeCount());
        principalServiceImp.expelStudent(student1);
        System.out.println("----------------------------------------------------------------");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("STUDENT2");
        System.out.println("-------------------------------");
        Student student2 = new Student("Jennifer Olivia","Female", "SS1B",12,"S2",2);
        System.out.println("Name: " + student2.getName());
        System.out.println("ID Number: " + student2.getId());
        System.out.println("Gender: " + student2.getGender());
        System.out.println("Class: " + student2.getDesignatedClass());
        teacherServiceImp.teach(student2);
        System.out.println("Strike Count: " + student2.getStrikeCount());
        principalServiceImp.expelStudent(student2);
        System.out.println("--------------------------------------------------------");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("STUDENT3");
        System.out.println("-------------------------------");
        Student student3 = new Student("Adaeze StellaMarris","Female", "SS1C",12,"S3",1);
        System.out.println("Name: " + student3.getName());
        System.out.println("ID Number: " + student3.getId());
        System.out.println("Gender: " + student3.getGender());
        System.out.println("Class: " + student3.getDesignatedClass());
        teacherServiceImp.teach(student3);
        System.out.println("Strike Count: " + student3.getStrikeCount());
        principalServiceImp.expelStudent(student3);
        System.out.println("-------------------------------------------------------------");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("STUDENT4");
        System.out.println("-------------------------------");
        Student student4 = new Student("Paschal Martins","Female", "SS1D",12,"S4",0);
        System.out.println("Name: " + student4.getName());
        System.out.println("ID Number: " + student4.getId());
        System.out.println("Gender: " + student4.getGender());
        System.out.println("Class: " + student4.getDesignatedClass());
        teacherServiceImp.teach(student4);
        System.out.println("Strike Count: " + student4.getStrikeCount());
        principalServiceImp.expelStudent(student4);
        System.out.println("-------------------------------------------------------");



        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("APPLICANT 1");
        System.out.println("-------------------------------");
        Applicant applicant1 = new Applicant("Gideon Kingsley","Male", 74,11);
        System.out.println("Name: " + applicant1.getName());
        System.out.println("Gender: " + applicant1.getGender());
        System.out.println("Exam Score: " + applicant1.getScore());
        System.out.println("Age: " + applicant1.getAge());
        principalServiceImp.admit(applicant1);
        System.out.println("--------------------------------------------------------");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("APPLICANT 2");
        System.out.println("-------------------------------");
        Applicant applicant2 = new Applicant("Ebuka Chibueze","Male",55,8);
        System.out.println("Name: " + applicant2.getName());
        System.out.println("Gender: " + applicant2.getGender());
        System.out.println("Exam Score: " + applicant2.getScore());
        System.out.println("Age: " + applicant2.getAge());
        principalServiceImp.admit(applicant2);
        System.out.println("------------------------------------------------------------------------------");


    }
}
