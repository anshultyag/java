package com.company;

public class EmpWageBuilderUC3 {
    public static void main(String[] args) {
        //constants
        int PART_TIME = 1;
        int FULL_TIME = 2;
        int EMP_RATE_PER_HOUR=20;
        //variable
        int empHrs = 0;
        int empWage = 0;
        //computation
        double empCheck = Math.floor(Math.random() * 10 ) % 3;
        if (empCheck == PART_TIME)
            empHrs = 4;
        else if (empCheck == FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
    empWage = empHrs * EMP_RATE_PER_HOUR;
    System.out.println("Emp wage: " + empWage);
    }

}
