package org.example;

import java.util.Arrays;

public class VarArgs {
    // variable length arguments means any number of arguments
    public static void main(String[] args) {
        fun(7,6,70,8,93,4,563);
        multiple(2,4,"Ronit","YASH","shubh");
        //the function can be called with one or more than one arguments
    }
    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
