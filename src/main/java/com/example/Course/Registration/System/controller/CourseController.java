package com.example.Course.Registration.System.controller;


import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.Course_Registry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {


    @Autowired
    CourseService service;

    @GetMapping("courses")
    public List<Course> availableCourses(){
        return service.funcToGetAvailableCourses();
    }


    @GetMapping("courses/enrolled")
    public List<Course_Registry> enrolledStudents(){
        return service.funcToGetEnrolledStudents();
    }


    @PostMapping("courses")
    public String addCourse(@RequestBody Course course){
        service.funcToAddCoursetoDB(course);
        return "Courses have been added to the database successfully";
    }

    @PostMapping("courses/register")
    public String enrollCourse(@RequestParam("username") String username,
                               @RequestParam("email_id") String email_id,
                               @RequestParam("courseName") String courseName){
        service.funcToGetEnrolledCourses(username,email_id,courseName);
        return "Congratulations! "+username+" your enrollment is successfull for the course "+courseName;


    }
}
