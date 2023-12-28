class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        
        for (int n : nums1) {
            count[n]++;
        }
        
        int len = 0;
        for (int n : nums2) {
            if (count[n] > 0) {
                ans[len++] = n;
                count[n]--;
            }
        }

        return Arrays.copyOfRange(ans, 0, len);
    }
}




// Initialization:

// nums1 = [1, 2, 2, 1]
// nums2 = [2, 2]
// count = [0, 0, ..., 0] (an array of size 1001 initialized with zeros)
// ans = [0, 0] (initialized with zeros)
// len = 0
// Counting occurrences in nums1:

// Iterate through nums1, updating the count array for each element.
// When encountering 1, increment count[1] to 1.
// When encountering 2, increment count[2] to 1.
// When encountering the second 2, increment count[2] to 2.
// When encountering the second 1, increment count[1] to 2.
// Intersection with nums2:

// Iterate through nums2, checking the count array for each element.
// For the first 2, since count[2] is greater than 0, add it to ans at position len (0), increment len to 1, and decrement count[2] to 1.
// For the second 2, since count[2] is now 1, add it to ans at position len (1), increment len to 2, and decrement count[2] to 0.
// Result:

// ans = [2, 2] (values filled based on the intersection of nums1 and nums2).
// Returning Result:

// Return Arrays.copyOfRange(ans, 0, len), which is [2, 2] (a copy of ans from index 0 to len).
// Explanation: The code uses two passes. In the first pass, it counts the occurrences of each element in nums1 
//using the count array. In the second pass, it iterates through nums2, and for each element, 
//if its count is greater than 0, it adds it to the ans array, updates the count, and increments the length. 
//The final result is the intersection of the two arrays, which is [2, 2] for the given input.