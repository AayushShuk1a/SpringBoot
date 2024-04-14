package com.restapi.Rest.API.rest;


import com.restapi.Rest.API.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    public List<Student>theStudents;

    @PostConstruct
    public void LoadData(){
        theStudents=new ArrayList<>();
        theStudents.add(new Student("Poornima","Mehta"));
        theStudents.add(new Student("Shika","Gupta"));
        theStudents.add(new Student("Shivam","dube"));
    }

    @GetMapping("/students")
    public List<Student> getStudent(){
        return theStudents;
    }

    @GetMapping("/student/{studentID}")
    public Student getStudentByID(@PathVariable Integer studentID)
    {
        if(studentID>=theStudents.size()||studentID<0)
        {
            throw new StudentNotFoundException("Student id is not found - "+studentID);
        }
        return theStudents.get(studentID);
    }



}



