package com.example.Course.Registration.System.service;


import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.Course_Registry;
import com.example.Course.Registration.System.repository.CourseRegistryRepository;
import com.example.Course.Registration.System.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {


    @Autowired
    CourseRepository courseRepo;

    @Autowired
    CourseRegistryRepository courseRegistryRepo;
    public List<Course> funcToGetAvailableCourses() {
        return courseRepo.findAll();
    }

    public List<Course_Registry> funcToGetEnrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void funcToGetEnrolledCourses(String username, String emailId, String courseName) {
        Course_Registry courseRegistry=new Course_Registry(username,emailId,courseName);
        courseRegistryRepo.save(courseRegistry);
    }


    public void funcToAddCoursetoDB(Course course) {
        courseRepo.save(course);
    }
}
