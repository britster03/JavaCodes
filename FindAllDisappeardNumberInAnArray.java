class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> dis=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            //find the index
            //suppose we have [4,3,2,2]
            //so first element in array is 4, therefore 4-1=3, index is 3
            int index=Math.abs(nums[i])-1;
            //after finding index we will se if the element at that index is negative
            //if its negative then continue, if not then make it negative
            if(nums[index]<0){
                continue;
            }else{
                nums[index]=nums[index]*-1;
            }
        }
        //after this our array will look like [4,-3,-2,-2]
        //now we will run another for loop and find the number which is non-negative
        //once we find the number, we will add its index number with one and add it in our list
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                dis.add(i+1);
            }
        }
        return dis;

    }
}