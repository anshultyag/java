package com.company;

import java.util.Scanner;

public class CartesianSystemUC01 {
    public static void main(String[] args) {

        //input for first Line
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinate of intial point   of line1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter y-coordinate of intial point  of line1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter x-coordinate of final pont  of line1: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y-coordinate of final pont  of line1: ");
        int y2 = sc.nextInt();

        double lengthOfLine1= Math.sqrt((x2 - x1) ^ 2 + (y2-y1) ^ 2);
         System.out.println("Length of a Line1: "+ lengthOfLine1);

         //input for second line
        System.out.println("Enter x-coordinate of intial point  of line2: ");
        int lx1 = sc.nextInt();
        System.out.println("Enter y-coordinate of intial point  of line2: ");
        int ly1 = sc.nextInt();
        System.out.println("Enter x-coordinate of final pont  of line2: ");
        int lx2 = sc.nextInt();
        System.out.println("Enter y-coordinate of final point  of line2: ");
        int ly2 = sc.nextInt();

        double lengthOfLine2= Math.sqrt((lx2 - lx1) ^ 2 + (ly2-ly1) ^ 2);
        System.out.println("Length of a Line2: "+ lengthOfLine2);

    }
}