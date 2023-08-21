package org.example;

public class OddEven {

    public static void main(String[] args) {
        int n=67;
        int m=13;
        System.out.println(isOdd(n));
        OddEven(m);
    }

    static boolean isOdd(int n){
        return (n&1)==1;
    }

    static void OddEven(int m){
        if(m==0){
            return;
        }
        if((m&1)==1){
            System.out.println("odd number:"+m);
        }else{
            System.out.println("even number:"+m);
        }

    }
}
