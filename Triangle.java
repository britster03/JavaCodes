package org.example;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        traingle2(4,0);  //row starts from 4 and column starts from 0
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void traingle2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            traingle2(r,c+1);
            System.out.print("* ");
        }else{
            traingle2(r-1,0);
            System.out.println();
 //row change and column again begin from 0
        }
    }
    static void traingle(int r, int c){
            if(r==0){
                return;
            }
            if(c<r){
                System.out.print("* ");
                traingle(r,c+1);
            }else{
                System.out.println();
                traingle(r-1,0); //row change and column again begin from 0
            }
    }


    static void bubble(int[] arr,int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r,c+1);
        }  else{
            bubble(arr,r-1,0);
        }
    }
}
