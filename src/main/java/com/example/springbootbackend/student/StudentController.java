package com.example.springbootbackend.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student" )
public class StudentController {
    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Harshana",
                        21,
                        LocalDate.of(2000,12,13),
                        "harshanabatagalla@gmail.com"
                )
        ) ;
    }
}
