package org.example.Array;

public class Max {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println(maxRange(arr,1,5));

    }

    static int maxRange(int[] arr,int start,int end){
        int maxVal=arr[0];
        for (int i=start;i<=end;i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
