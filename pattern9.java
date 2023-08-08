package org.example.Array;

public class pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    //*
    //* *
    //* * *
    //* * * *
    //* * * * *
    //* * * *
    //* * *
    //* *
    //*
    static void pattern9(int n){
        for(int row=0;row<2*n;row++){
            int totalColsintrow = row>n?2*n-row:row;
            for(int col=0;col<totalColsintrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
