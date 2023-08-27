package org.example;

public class linearsearch {

    //linear search using recursion
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr,1,0));
        System.out.println(findLastIndex(arr,6, arr.length-1));
    }


    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) { // when index is at the last
            return false; //sorry bro couldn't find it
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) { // when index is at the last
            return -1; //sorry bro couldn't find it
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }

    }


    static int findLastIndex(int[] arr, int target, int index) {
        if (index == -1) { // when index is at the last
            return -1; //sorry bro couldn't find it
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findLastIndex(arr, target, index - 1);
        }


    }
}