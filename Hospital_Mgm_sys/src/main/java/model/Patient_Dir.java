/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Hitesh
 */
public class Patient_Dir {
    private ArrayList<Patient> dir = new ArrayList<>();
    
    public Patient_Dir(){
        this.dir = new ArrayList<>();
    }

    public void setDir(ArrayList<Patient> dir) {
        this.dir = dir;
    }
    
    public ArrayList<Patient> getDir() {
        return dir;
    }
    
    public Patient addPerson(){
        Patient person = new Patient();
        dir.add(person);
        return person;
    }
}
