/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hitesh
 */
public class Patient extends Person{
    private String uniqueID;
    private String bloodG;

    public String getBloodG() {
        return bloodG;
    }

    public void setBloodG(String bloodG) {
        this.bloodG = bloodG;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
}
