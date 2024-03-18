/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex2;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Hatto
 */
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String name ;
    private List<String> contents;
    private Float coef;
 
    public String toString() {
return "Course{" + "name=" +name + ",contents=" + contents.toString() + ",coef=" + coef + "}";
}
}
