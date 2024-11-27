package com.binary.day1;

public class LoopStatements {
    public static void main(String[] args) {

// for
// while
// do while
// for (start ; condition; update){
//     repeating code
// }

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        for (int a = 2; a < 3; a++) {
            System.out.println(a);
        }

        for (short b = 39; b < 150; b += 2) {
            if (b % 5 == 0) {
                System.out.println("Divisible : " + b);
            } else {
                System.out.println("Not divisible : " + b);
            }
        }


        int c = 39;
        while (c < 150) {
            if (c % 5 == 0) {
                System.out.println(c + "this is divisible by 5");
            } else {
                System.out.println(c);
            }
            c += 2;
        }


        int j = 39;
        do {
            if (j % 5 == 0) {
                System.out.println(j + "this is divisible by 5");
            } else {
                System.out.println(j);
            }
            j += 2;
        } while (j < 150);

        int k = 39;
        do {
            if (k % 5 == 0) {
                System.out.println(k + "this is divisible by 5");
            } else {
                System.out.println(k);
            }
            k += 2;
        } while (k < 150);


        //   0 1 2 3 4
        // 0 *
        // 1 * *
        // 2 * * *
        // 3 * * * *
        // 4 * * * * *


        for (int row = 0; row <= 4; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
System.out.println("-------------------------");
        for (int row = 0; row <= 4; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("  * ");
            }
            System.out.println();
        }


//
//
//
//

    }
}