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
public class Hospital_Dir {
    private ArrayList<Hospital> hospitaldir = new ArrayList<>();
    
    public Hospital_Dir(){
        this.hospitaldir = new ArrayList<>();
    }
    
    public ArrayList<Hospital> getHospitaldir(){
        return hospitaldir;
    }
    public void setHospitalDir(ArrayList<Hospital> hospitaldir) {
    this.hospitaldir = hospitaldir;
    }
    
    public Hospital addHospitalDir(){
        Hospital hosp = new Hospital();
        hospitaldir.add(hosp);
        return hosp;
    }
}
