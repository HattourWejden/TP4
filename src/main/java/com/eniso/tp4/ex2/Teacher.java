/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex2;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Hatto
 */
@Getter
@Setter

public class Teacher extends User {
    private Long hIndex;
    private List<Course> courses;

    public Teacher(String firstName, String lastName, String email, Long cin, Long hIndex, List<Course> courses) {
        super(firstName, lastName, email, cin);
        this.hIndex = hIndex;
        this.courses = courses;
    }
    @Override
      public void displayInfo() {
        super.displayInfo();
        System.out.println("hindex: " + hIndex);
        System.out.println("courses: " + courses);
        
    }

    public void updateProfile(String newFirstName, String newLastName, String newEmail,Long newhIndex, List<Course> newCourses) {
        super.updateProfile(newFirstName, newLastName, newEmail);
        this.hIndex = newhIndex;
        this.courses = newCourses;
       
    }

    @Override
    public boolean authenticate() {
       return true ;
    }
    public void displayCoursesContent() {
        for (Course course : courses) {
            System.out.println("Course: " + course.getName());
            System.out.println("Contents: " + course.getContents());
            System.out.println("Coefficient: " + course.getCoef());
        }
    }
}
