package com.example.Course.Registration.System.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter @Data
public class Course_Registry {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //No need of providing value if we put Generated value
    private String username;
    private String email_id;
    private String courseName;

    public Course_Registry(String username, String email_id, String courseName) {
        this.username = username;
        this.email_id = email_id;
        this.courseName = courseName;
    }
    public Course_Registry(){

    }
}
