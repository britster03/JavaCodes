package org.example.Array;

public class Leet1 {

    public static void main(String[] args) {
        //find numbers wuth even number of digits
        int[] nums={11,234,30,4444,5};
        System.out.println(findnumbers(nums));

      //  System.out.println(digits(53535));
    }

    static int findnumbers(int[] nums){
        int count=0;

        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //check whether the number of digits are even
    static boolean even(int num){
        int numofdigits=digits(num);
        if(numofdigits % 2 == 0){
            return true;
        }
        return false;
    }

    //optimized and shortcut way of finding numer of digits in a num
    static int digits(int num){
        if(num<0){
            num=num * -1;
        }
        return (int)(Math.log10(num))+1;
    }

    //count number of digits in a number
//     static int digits(int num) {
//        if(num<0){
//            num=num * -1;
//        }
//        if(num==0){
//            return 1;
//        }
//        int count=0;
//        while(num>0) {
//            count++;
//            num = num / 10;
//        }
//        return count;
//    }

}
