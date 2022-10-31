/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hitesh
 */

import java.util.Date;


public class Person {
    private String usrname;
    private String pass;
    private String email;
    private String role;
    private int mob;
    private String gender;
    private Date dob;
    private String com;

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }
    private String AccountStatus = "Active";
    ;

    public String getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(String AccountStatus) {
        this.AccountStatus = AccountStatus;
    }



    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
