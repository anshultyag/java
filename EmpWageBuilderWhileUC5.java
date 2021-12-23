package com.company;

public class EmpWageBuilderWhileUC5 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        //variable
        int empHrs = 0, empWage = 0, totalEmpWage = 0, totalEmpHrs=0;
        //computation
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            if (empCheck ==IS_PART_TIME)
                    empHrs = 4;
            else if(empCheck== IS_FULL_TIME)
                    empHrs = 8;
            else
                    empHrs = 0;

            System.out.println("Day "+ day + ":  " + empHrs);
            totalEmpHrs = totalEmpHrs + empHrs;
        }
            empWage = totalEmpHrs * EMP_RATE_PER_HOUR;

            System.out.println("Emp wage: " + empWage);
            System.out.println("Emp Hour: " + totalEmpHrs);

    }
    }
