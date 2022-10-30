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
public class Community_Dir {
    private ArrayList<Community> com_dir = new ArrayList<>();
//    
    public Community_Dir(){
        this.com_dir = new ArrayList<>();
    }

    public ArrayList<Community> getComDir() {
        return com_dir;
    }

//    public void setDoctorDir(ArrayList<DoctorPerson> doctorDir) {
//        this.doctorDir = doctorDir;
//    }
    
    public Community addCom(){
        Community com = new Community();
        com_dir.add(com);
        return com;
    }
    
}
