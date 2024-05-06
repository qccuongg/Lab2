/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Salaries {

    public int getCommonSalary() {
        return commonSalary;
    }

    public void setCommonSalary(int commonSalary) {
        this.commonSalary = commonSalary;
    }
    private ArrayList<Employee> EmpList =new ArrayList<>();
    private int commonSalary;

    public Salaries(int commonSalary) {
        EmpList = new ArrayList<>();
        this.commonSalary = commonSalary;
    }
    
    public Salaries() {
        EmpList = new ArrayList<>();
    }
    
    public void InputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee emp = new Employee();
            emp.setCommonSalary(this.commonSalary);
            emp.InputEmp(sc);
            EmpList.add(emp);
        }
    }
    
    public void printSalary() {
        for (Employee employee : EmpList) {
            employee.OuputSalary();
        }
    }

    public void printEmployeeBySalary () {
        EmpList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        }); 
    }
    //Print sorted employee
    System.out.println("Sorting by descending salary");
        for (Employee employee : EmpList) {
            System.out.println("Employee name: " + employee.getName() + " | Salary " + employee.getSalary());
        }
    
    public void highestSalaryEmployee() {
        EmpList.sort(new Comparator<Employee>() {
            @Override
            public int compare (Employee e1, Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        });
        
        System.out.println("Employee with the highest salary :" + EmpList.get(0) + "");
    }
}
