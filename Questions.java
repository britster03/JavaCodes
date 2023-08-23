package org.example;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isPrime(n));
//  System.out.println(isArmstrong(n));
//        boolean ans = isArmstrong(n);
//        boolean ans = isPrime(n);
//        System.out.println(ans);
        for(int i=100;i<1000;i++){
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    //print all the three digit armstrong number

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
            return sum == original;
    }

//    static boolean isPrime(int n) {
//
//        //if the number is divisible by one and by its own then it is a prime number
//        if (n <= 1) {
//            return false;
//        }
//        int c = 2;
//        while (c * c < n) {
//            if (n % c == 0) {
//                return false;
//            }
//            c = c + 1;
//        }
//        return c * c > n;
//    }
}
