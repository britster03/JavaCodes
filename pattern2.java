package org.example.Array;

public class pattern2 {
    public static void main(String[] args) {
        //pattern2(4);
        pattern(4);
    }
    // 1 1 1 1
    // 2 2 2 2
    // 3 3 3 3
    // 4 4 4 4
    static void pattern2(int n){
        int count=1;
        for(int row=0;row<=n;row++){

            for(int col=0;col<=n;col++){
                System.out.print(count);
            }
            System.out.println();
            count++;
        }
    }
    //A A A A
    //B B B B
    //C C C C
    //D D D D

    static void pattern(int n){
        char n1='A';
        for(int row=0;row<=n;row++){

            for(int col=0;col<=n;col++){
                System.out.print(n1);
            }
            System.out.println();
            n1++;
        }
    }
}
