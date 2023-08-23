package org.example;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
       // sum();
//        int ans=sum2();
//        System.out.println(ans);
//        int ans=sum3(89,78);
//        System.out.println(ans);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name= in.next();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }

    static String myGreet(String name){
        String message= "Hello " + name;
        return message;
    }

//    static int sum2(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int num1= in.nextInt();
//        System.out.println("Enter number 2");
//        int num2= in.nextInt();
//        int sum= num1+num2;
//        return sum;
//    }
//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int num1= in.nextInt();
//        System.out.println("Enter number 2");
//        int num2= in.nextInt();
//        int sum= num1+num2;
//        System.out.println("the sum ="+ sum);
//    }
//        static int sum3(int a, int b){
//            int sum3 = a+b;
//            return sum3;
//        }
}
