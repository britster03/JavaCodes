package org.example;

public class Nto1 {

    public static void main(String[] args) {
        // fun(2);
        //System.out.println(fact(4));
//        System.out.println(sum(3));
        //int ans = digitsum(1234);
       // int ans = digitprod(1234);
        reverse(1234);
        System.out.println(sum);
        System.out.println(palin(23433));
    }

    //reverse 1234 using recursive
    static int sum=0;
    static int reverse(int n){
        if(n==0){
            return 0;
        }
        int rem= n%10;
        sum=sum *10+rem;
        reverse(n/10);
        return sum;
    }

    static boolean palin(int n){
        return n==reverse(n);

    }

//    //sum of digits 1 + 2 + 3 + 4 =10
//    static int digitsum(int n){
//        if(n==0){
//            return 0;
//        }
//        return (n%10) + digitsum(n/10);
//    }

//    //product of digits 1 * 2* 3 *4 =
//    static int digitprod(int n){
//        if(n%10 == n){
//            return n;
//        }
//        return (n%10) * digitprod(n/10);
//    }
    //sum of n to 1
//
//    static int sum(int n){
//        if(n<=1){
//            return 1;
//        }
//
//        return n + sum(n-1);
//    }
//    //fact of n to 1
//    static int fact(int n){
//        if(n<=1){
//            return 1;
//        }
//
//        return n * fact(n-1);
//    }
//
//    // 1 to n
//
//    static void fun1(int n){
//        if(n==0){
//            return;
//        }
//        fun1(n-1);
//        System.out.println(n);
//
//    }
//
//    // n to 1
//
//    static void fun(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        fun(n-1);
//    }
}
