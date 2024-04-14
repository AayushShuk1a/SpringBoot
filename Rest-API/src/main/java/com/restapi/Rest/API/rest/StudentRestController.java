package com.restapi.Rest.API.rest;


import com.restapi.Rest.API.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {


    @GetMapping("/students")
    public List<Student> getStudent(){
        List<Student>students=new ArrayList<>();
        students.add(new Student("Poornima","Mehta"));
        students.add(new Student("Shika","Gupta"));
        students.add(new Student("Shivam","dube"));
        return students;

    }
}
