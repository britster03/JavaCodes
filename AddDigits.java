public class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        return (num%9==0)?9:num%9;
        //if num is divisible by 9 then the sum of its digits is 9, if not then the sum of its ///digits is the remainder
    }
} {
    
}
