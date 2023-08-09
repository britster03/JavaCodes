package org.example.Array;

public class pattern4 {
    public static void main(String[] args) {
        pattern4(2);

        // 1 2 3
        // 4 5 6
        // 7 8 9
    }

    static void pattern4(int n){
        int count=1;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
