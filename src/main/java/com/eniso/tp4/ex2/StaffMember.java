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
public class StaffMember extends User {
   
    private String qualification;
    private Integer experience;
    private List<String> tasks;

    public StaffMember(String firstName, String lastName, String email, Long cin, String qualification, Integer experience, List<String> tasks) {
        super(firstName, lastName, email, cin);
        this.qualification = qualification;
        this.experience = experience;
        this.tasks = tasks;
    }
      public void displayInfo() {
       super.displayInfo();
        System.out.println("qualification: " + qualification);
        System.out.println("experience: " + experience);
        System.out.println("tasks: " + tasks);
        
    }

    public void updateProfile(String newFirstName, String newLastName, String newEmail,List newTasks,int newExperience,String  newQualification) {
        super.updateProfile(newFirstName, newLastName, newEmail);
        this.qualification = newQualification;
        this.experience = newExperience;
         this.tasks = newTasks;
       
    }

    public boolean authenticate() {
       return true ;
    }

    public void finishTask(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
        }
    }
}
    

