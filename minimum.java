package org.example.Array;

public class minimum {
    public static void main(String[] args) {
        int[] arr={11,22,33,4,55,6,-7};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans=arr[0];
        for(int index=1;index<arr.length;index++){
            if(arr[index]<ans){
                ans=arr[index];
            }
        }
        return ans;
    }
}
