/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Employee {
    private String employeeCode;
    private String Name;
    private int Years;
    private double salaryCoe;
    private double commonSalary;

    public Employee() {
    }

    public Employee(String employeeCode, String Name, int Years, long salaryCoe, long commonSalary) {
        this.employeeCode = employeeCode;
        this.Name = Name;
        this.Years = Years;
        this.salaryCoe = salaryCoe;
        this.commonSalary = commonSalary;
    }
    
    public void InputEmp(Scanner sc) {
        System.out.print("Enter employee code: ");
        this.employeeCode = sc.nextLine();
        System.out.print("Enter employee name: ");
        this.Name = sc.nextLine();
        System.out.print("Enter years of service: ");
        this.Years = sc.nextInt();
        salaryCoe = Math.pow(1.10, Years);
        System.out.print("Enter common salary: ");
        this.commonSalary = sc.nextDouble();
        double salary = commonSalary * salaryCoe;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setYears(int Years) {
        this.Years = Years;
    }

    public void setSalaryCoe(double salaryCoe) {
        this.salaryCoe = salaryCoe;
    }

    public void setCommonSalary(double commonSalary) {
        this.commonSalary = commonSalary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getName() {
        return Name;
    }

    public int getYears() {
        return Years;
    }

    public double getSalaryCoe() {
        return salaryCoe;
    }

    public double getCommonSalary() {
        return commonSalary;
    }
    
    public void OuputSalary() {
        System.out.println("Employee name: " + Name + " | Employee code: " + employeeCode + " | Years of service: " + Years);
    }
    
    public void getSalary() {
        return salary;
    }
}
