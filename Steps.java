package org.example;

public class Steps {

    //leet : easy:
    //calculate number if steps to reduce a number to 0
    public static void main(String[] args) {
        System.out.println(Steps(14));
    }
    static int Steps(int num){
            return helper(num,0);
    }
    private static int helper(int num, int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
            return helper(num-1,steps+1);
    }
}
