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
public class ComplexNumber {

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }
    private double re;
    private double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber() {
    }
    
    public void InputComplexNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part: ");
        re = sc.nextDouble();
        System.out.println("Enter the imaginary part: ");
        im = sc.nextDouble();
    }
    
    public void OutputComplexNumber() {
        System.out.println(re + " + " + im + "i");
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    
    public ComplexNumber Plus(ComplexNumber num) {
        double resRe = this.re  + num.getRe();
        double resIm = this.im + num.getIm();
        return new ComplexNumber(resRe, resIm);
    }
    
    public ComplexNumber Minus(ComplexNumber num) {
        double resRe = this.re - num.getRe();
        double resIm = this.im - num.getIm();
        return new ComplexNumber(resRe, resIm);
    }
    
    public ComplexNumber Multiply(ComplexNumber num) {
        double resRe = this.re * num.getRe() - this.im * num.getIm();
        double resIm = this.re * num.getIm() + this.im * num.getRe();
        return new ComplexNumber(resRe, resIm);
    }
    
    public ComplexNumber Divide(ComplexNumber num) {
        double resRe = (this.re * num.getRe() + this.im * num.getIm()) / ((num.getRe() * num.getRe()) + num.getIm() * num.getIm());
        double resIm = (this.im * num.getRe() - this.re * num.getIm()) / ((num.getRe() * num.getRe()) + num.getIm() * num.getIm());
        return new ComplexNumber(resRe, resIm);
        
    }
}
