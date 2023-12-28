class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                //if great then search left
                end=mid-1;
            }else{
                //if small search right
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}


// Initial state:

// letters = ["a", "b"]
// target = "z"
// start = 0
// end = 1
// First iteration:

// Calculate mid = 0 + (1 - 0) / 2 = 0.
// Check if letters[0] ("a") is greater than target ("z"). It's not.
// Update start to mid + 1, so start becomes 1.
// Second iteration:

// Calculate mid = 1 + (1 - 1) / 2 = 1.
// Check if letters[1] ("b") is greater than target ("z"). It's not.
// Update start to mid + 1, so start becomes 2.
// Exit Condition:

// The condition start <= end is no longer true (start is now 2, and end is 1).
// Exit the loop.
// Result:

// Calculate start % letters.length (which is 2 % 2), resulting in 0.
// Return letters[0], which is "a".
// Final Result:

// The output is "a", which matches the expected output.



// Initial state:

// letters = ["c", "f", "j"]
// target = "c"
// start = 0
// end = 2
// First iteration:

// Calculate mid = 0 + (2 - 0) / 2 = 1.
// Check if letters[1] ("f") is greater than target ("c").
// Since "f" is greater, update end to mid - 1, so end becomes 0.
// Second iteration:

// Calculate mid = 0 + (0 - 0) / 2 = 0.
// Check if letters[0] ("c") is greater than target ("c").
// Since "c" is not greater, update start to mid + 1, so start becomes 1.
// Exit Condition:

// The condition start <= end is no longer true (because start is now greater than end).
// Result:

// Return letters[start % letters.length], which is letters[1 % 3], equivalent to letters[1].
// The result is "f," which matches the expected output.