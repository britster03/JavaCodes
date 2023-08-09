package org.example.Array;

public class pattern3 {

    // 3 2 1
    // 3 2 1
    // 3 2 1
    public static void main(String[] args) {
    pattern3(2);
    }
    int n=3;
    static void pattern3(int n){
        for(int row=0;row<=n;row++){

            for(int col=0;col<=n;col++){
                System.out.print(n-col+1);
            }
            System.out.println();
        }
    }

}


