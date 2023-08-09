package org.example.Array;

import java.util.Scanner;

public class pattern5 {


    // 1
    // 2 3
    // 4 5 6
    public static void main(String[] args) {
        int n=3;

//        Scanner in= new Scanner(System.in);
//        n= in.nextInt();
        int count=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
