/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex2;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Hatto
 */
@Getter
@Setter 

public class Student extends User{
    
    private Double average;
    private Classe currentClass;
    private Status status;
    public Student(String firstName, String lastName, String email, Long cin, Double average, Classe currentClass, Status status) {
        super(firstName, lastName, email, cin );
        this.average = average;
        this.currentClass = currentClass;
        this.status = status;
    }
     public void displayInfo() {
       super.displayInfo();
        System.out.println("average: " + average);
        System.out.println("currentClass: " + currentClass);
        System.out.println("status: " + status);
    }

    public void updateProfile(String newFirstName, String newLastName, String newEmail,Double newAverage,Classe newCurrentClass,Status newStatus) {
        super.updateProfile(newFirstName, newLastName, newEmail);
        this.average = newAverage;
        this.currentClass = newCurrentClass;
        this.status = newStatus;
    }

    public boolean authenticate() {
       return true ;
    }
}
