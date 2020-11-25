/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author WINDOWS 10
 */
public class InternshipEmployee extends Employee {
    private int length;
    
    public InternshipEmployee(String name,int length){
        this.length =length;
        this.name = name;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public String getEmployee(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as aintership employee for "+length+" month/s\n";
        return info;
    }
}
