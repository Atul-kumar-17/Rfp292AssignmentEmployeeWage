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
        // Calculation of Daily Wage
        int wagePerHrs = 20;
        int fullDayHrs = 8;
        int dailyWage = wagePerHrs * fullDayHrs;
        if(randomCheck==1){
            System.out.println("Employee is Present & his daily Wage is = "+dailyWage);
        }else System.out.println("Employee is Absent & his daily Wage is 0 ");

//  Adding Part time Employee
        int Is_part_time = 1;
        int Is_full_time = 2;
        int randomCheck1 = (int)Math.floor(Math.random() * 10) % 3;
        if(randomCheck1==1){
            System.out.println("Part time Employee.");
        }else{
            System.out.println("Full time Employee.");
        }
        int parttimeHrs = 4;
        int ptDailyWage = parttimeHrs * wagePerHrs;
        System.out.println("Part time Employee daily Wage = " + ptDailyWage);
    }
}
