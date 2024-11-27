package com.binary.day1;

public class HomeWorkDay1 {
    public static void main(String[] args) {

        int a = 2;

        if (a > 0) {
            System.out.println(" it is positive ");
        } else if (a < 0){
            System.out.println(" it is negative");
        } else {
            System.out.println(" it is zero");
        }

        System.out.println("----------------");

        int b = 4;

        if (b % 2 == 0){
            System.out.println(" it is even");
        } else {
            System.out.println(" it is odd");
        }

        System.out.println("----------------");


        int grade = 95;
        if (grade >= 90 && grade <= 100){
            System.out.println("  A");
        } else if (grade >= 80){
            System.out.println("  B");
        } else if (grade >= 70){
            System.out.println("  C");
        } else if (grade >= 60){
            System.out.println("  D");
        } else {
            System.out.println("  F");
        }

        System.out.println("----------------");

        int side1 = 3;
        int side2 = 3;
        int side3 = 3;

        if ( side1 == side2 && side2 == side3){
            System.out.println("equilateral");
        } else if (side1 == side2 || side2 > side3){
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }

        System.out.println("----------------");


        //for (int d = 0; d <= 10; d++){
         //   System.out.println(d);

        //}

       /* for (short m = 39; m < 150; m ++) {
            if (m % 2 == 0) {
                System.out.println("Divisible : " + m);
            } else {
                System.out.println("Not divisible : " + m);
            }
        } */





















    }
}
