package org.example.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int ans=linearsearch(nums,5);
        System.out.println(ans);
        int ans1=linearsearch1(nums,99);
        System.out.println(ans1);
    }
    static int linearsearch1(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        return -1;
    }
    static int linearsearch(int[] arr,int target){
            if(arr.length==0){
                return -1;
            }
            for(int index=0;index< arr.length;index++){
                int element=arr[index];
                if(element==target){
                    return index;
                }
            }
            return -1;
    }
}
