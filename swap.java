package org.example;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int temp = a;
//        a = b;
//        b= temp;
//
//        System.out.println(a +" "+ b);

        int[] arr={1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0]=99; // if you make a change to the object via this ref variable, same object will be changed
    }
}
