/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hitesh
 */
public class HR_product {
    private String name;
    private int employeeId;
    private int age;
    private String gender;
    private String start_date;
    private int level;
    private String team_info;
    private String position_title;
    private long phone_no;
    private String email;
    private String photo; 

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        if (photo==null){
            JOptionPane.showMessageDialog(null, "Image is not inserted");
        }
        this.photo = photo;
    }
            
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(( name != null) && name.matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$") )
        {    
            this.name = name;
        }
        
        else
               {
            JOptionPane.showMessageDialog(null,"Please enter a Valid Name");
                }
         }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeam_info() {
        return team_info;
    }

    public void setTeam_info(String team_info) {
        this.team_info = team_info;
        
         }
        
    public String getPosition_title() {
        return position_title;
    }

    public void setPosition_title(String position_title) {
        this.position_title = position_title;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
        }
       
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if((email!=null) && email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"))
                {
                       this.email = email;
                }
        else
                {
            JOptionPane.showMessageDialog(null,"Enter a valid email Address");
                }
    }
    
    @Override
    public String toString(){
        return name;
    }
}

