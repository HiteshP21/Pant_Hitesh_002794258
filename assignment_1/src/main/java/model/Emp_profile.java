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
public class Emp_profile {
    private ArrayList<HR_product> emp_info;
    
    public Emp_profile(){
        this.emp_info = new ArrayList<HR_product>();
    }

    public ArrayList<HR_product> getEmp_info() {
        return emp_info;
    }

    public void setEmp_info(ArrayList<HR_product> emp_info) {
        this.emp_info = emp_info;
    }
    
    public HR_product addData(){
        HR_product newData = new HR_product();
        emp_info.add(newData);
        return newData;
    }
    
    public void deleteInfo(HR_product vs){
        emp_info.remove(vs);
    }
}
