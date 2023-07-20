package org.example.Array;

public class Leet2 {
    public static void main(String[] args) {
        //Richest customer wealth or max wealth
        int[][] accounts={
                {1,2,3},
                {3,2,1}
        };

        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        //person row
        //account col
            int ans=Integer.MIN_VALUE;
        for(int person=0;person< accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++)
            {
                sum+=accounts[person][account];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
