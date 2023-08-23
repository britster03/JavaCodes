package org.example;

public class Overloading {

    public static void main(String[] args) {
fun(1);
fun("ronit");
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
//number of arguments should be different or type of arguments should be different
}
