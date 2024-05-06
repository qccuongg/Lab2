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
public class BankAccount {
    private ArrayList<CustomerAccount> AccountsList = new ArrayList<>();

    public BankAccount() {
    }
    
    public void InputAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of accounts you want to create: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            CustomerAccount acc = new CustomerAccount();
            acc.Input(sc);
            AccountsList.add(acc);
        }
    }
    
    public void Print() {
        for (int i = 0; i < AccountsList.size(); i++) {
            CustomerAccount acc = AccountsList.get(i);
            System.out.println(acc);
        }
    }
    
    public void DepositAccount() {
        int accNumber;
        System.out.print("Enter account number: ");
        Scanner sc = new Scanner(System.in);
        accNumber = sc.nextInt();
        System.out.print("Enter the amount of money to deposit: ");
        double amount = sc.nextDouble();
        for (int i = 0; i < AccountsList.size(); i++) {
            if (AccountsList.get(i).CompareAccountNumber(accNumber))
                AccountsList.get(i).Deposit(amount);
        }
    }
    
    public void TransferMoney() {
        int accNumberRe, accNumberSen;
        double money;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input money: ");
        money = sc.nextDouble();
        System.out.print("Account 1: ");
        accNumberSen = sc.nextInt();
        System.out.print("Account 2: ");
        accNumberRe = sc.nextInt();
        CustomerAccount acc1 = null, acc2 = null;
        for (int i = 0; i < AccountsList.size(); i++) {
            if (AccountsList.get(i).CompareAccountNumber(accNumberSen))
                acc1 = AccountsList.get(i);
            if (AccountsList.get(i).CompareAccountNumber(accNumberRe))
                acc2 = AccountsList.get(i);
        }
        if (acc1 != null && acc2 !=  null)
            acc1.TransferMoney(acc2, money);
    }
}
