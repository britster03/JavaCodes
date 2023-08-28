package org.example;

public class sorted {

    //check whetehr array is sorted
    public static void main(String[] args) {
                int[] arr={1,2,3,5,26,18};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
