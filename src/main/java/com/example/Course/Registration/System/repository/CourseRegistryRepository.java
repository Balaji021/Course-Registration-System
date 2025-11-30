package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.Course_Registry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistryRepository extends JpaRepository<Course_Registry,Integer> {
}
