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
public class Doctor_Dir {
    private ArrayList<Doctor> d_Dir = new ArrayList<>();
//    
    public Doctor_Dir(){
        this.d_Dir = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorDir() {
        return d_Dir;
    }

//    public void setDoctorDir(ArrayList<DoctorPerson> doctorDir) {
//        this.doctorDir = doctorDir;
//    }
    
    public Doctor addDoc(){
        Doctor doc = new Doctor();
        d_Dir.add(doc);
        return doc;
    }
}
