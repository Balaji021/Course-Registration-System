package com.example.Course.Registration.System.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Course {

    @Id
    private String courseId;
    private String courseName;
    private String trainerName;
    private int duration;

    public Course(int courseId, String courseName, String trainerName, int duration) {
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Course(String courseId, String courseName, String trainerName, int duration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.trainerName = trainerName;
        this.duration = duration;
    }

    public Course() {
    }
}
