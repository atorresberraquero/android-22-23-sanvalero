package com.example.mvc_netflix_1.controller;

import com.example.mvc_netflix_1.MainActivity;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.pojo.Student;

public class StudentController {
    private StudentWS model;
    private MainActivity view;

    public StudentController(StudentWS model, MainActivity view) {
        this.model = model;
        this.view = view;
    }

    public void getStudent(){
        // THREADSSSSSS!!! -> RETROFIT 2
        // IRIA A WEB SERVICE REST + COGERIA DATA STUDENT + Y VOLVERIA
        Student student = model.getStudentWS();
        view.printStudentDetails(student);
    }

    public void updateStudent(Student student){
        Student student1 = model.updateStudentWS(student);
        view.printStudentDetails(student1);
    }


}
