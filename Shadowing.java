package org.example;

public class Shadowing {

    // shadowing in java is a pracitce of using two variabes of same name within a declared scope
    static int x =90;

    public static void main(String[] args) {
        System.out.println(x); //90
        int x; //the class variable at line 6 is shadowed by this
   //     System.out.println();  scope will begin when variable is initialized
        x=40;
        System.out.println(x); //40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }

}
