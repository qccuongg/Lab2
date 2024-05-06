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
public class CustomerAccount {

    public int getmAccNum() {
        return mAccNum;
    }

    public String getmName() {
        return mName;
    }

    public double getBalance() {
        return mBalance;
    }

    public CustomerAccount(int mAccNum, String mName, double Balance) {
        this.mAccNum = mAccNum;
        this.mName = mName;
        this.mBalance = Balance;
    }

    public CustomerAccount() {
    }
    private int mAccNum;
    private String mName;
    private double mBalance;
    
    public void Input(Scanner obj) {
        System.out.print("Enter account number: ");
        mAccNum = obj.nextInt();
        obj.nextLine();
        System.out.print("Enter Name: ");
        mName = obj.nextLine();
        System.out.print("Enter Balance: ");
        mBalance = obj.nextDouble();
             
    }
    
    public void Output() {
        
    }
    
    public String ToString() {
        return String.valueOf(mBalance);
    }
    
    public void Deposit(double money) {
        mBalance += money;
    }
    
    public boolean Withdraw (double money) {
        if (money <= 0) return false;
        if (money > this.mBalance) return false;
        
        this.mBalance -= money;
        return true;
    }
    
    public boolean TransferMoney (CustomerAccount acc, double money) {
        if (money <= 0) return false;
        if (money > this.mBalance) return false;
        acc.Deposit(money);
        return true;
    }
    public boolean CompareAccountNumber (int acc) {
        return acc == this.mAccNum;
    }
}
