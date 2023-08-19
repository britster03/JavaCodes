package org.example.Array;

public class searchinstring {
    public static void main(String[] args) {
        String name="Ronit";
        char target='w';
        System.out.println(search(name,target));
        System.out.println(search2(name,target));

    }
    static boolean search2(String name,char target){
        if(name.length()==0){
            return false;
        }

        for(char ch:name.toCharArray()){ //convert string to array to usie in for each loop
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }

        for(int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
