package com.rmnlcn.REST_CRUD_API.rest;

import com.rmnlcn.REST_CRUD_API.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Romain", "Luciano", 36));
        theStudents.add(new Student("Isabelle", "Lapraz", 37));
        theStudents.add(new Student("Aurélie", "Faure", 34));

        return theStudents;
    }
}
