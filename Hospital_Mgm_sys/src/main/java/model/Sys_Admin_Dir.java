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
public class Sys_Admin_Dir {
    private ArrayList<SysAdmin> admin_Dir = new ArrayList<>();
    
    public Sys_Admin_Dir(){
        this.admin_Dir = new ArrayList<>();      
    }

    public ArrayList<SysAdmin> getAdminDirectory() {
        return admin_Dir;
    }

    public void setAdminDirectory(ArrayList<SysAdmin> adminDirectory) {
        this.admin_Dir = adminDirectory;
    }
    
    public SysAdmin addSystemAdmin(){
        SysAdmin admin = new SysAdmin();
        admin_Dir.add(admin);
        return admin;
    }
}
