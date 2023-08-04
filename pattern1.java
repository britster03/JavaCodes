package org.example.Array;

import java.util.Scanner;

public class pattern1 {

    //*
    //* *
    //* * *
    //* * * *
    public static void main(String[] args) {
        int n;

        Scanner in= new Scanner(System.in);
        n= in.nextInt();

        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
