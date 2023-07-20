package com.bridgelabz;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");
        // Check Employee is present or not using random
        int randomCheck = (int)Math.floor(Math.random() * 10) % 2;
        if(randomCheck==1){
            System.out.println("Employee is Present.");
        }else{
            System.out.println("Employee is Absent.");
        }
    }
}
