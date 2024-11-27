package com.binary.day1;

public class ConditionalStatements {

    public static void main(String[] args) {













        String timing = "lunch";

        switch (timing){
            case "lunch":
                System.out.println("lunch menu");
                break;
            case "dinner":
                System.out.println("dinner menu");
                break;
            case "breakfast":
                System.out.println("breakfast menu");
                break;
            default:
                 System.out.println("resturant Closed");
            break;
        }



        byte age = 55;
        if (age >= 50) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("not a senior Citizen");
        }





        byte personAge = 20;

        if (personAge>=20) {
            System.out.println("The person is a youngster");
        } else {
            System.out.println("a teenager");

        }
    }
}





