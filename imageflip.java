package org.example;

public class imageflip {
    public static void main(String[] args) {
        int[][] image={
                {1,1,0},
                {1,0,1},
        }
    }

    public int[][] flipAndinvertImage(int[][] image){
        for(int[] row:image){
            //reverse this array
            for(int i=0;i<(image[0].length+1)/2;i++){
                //swap
                int temp=row[i]^1;
                row[i]=row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp;
            }
        }
        return image;
    }
}
