class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int len=word1.length();
        int[] freq=new int[26];

        for(int i=0;i<len;i++){
            freq[word1.charAt(i)-'a']++;
            freq[word2.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(Math.abs(freq[i])>3){
                return false;
            }
        }
        return true;
    }
}



// Initialization:

// word1 = "abcdeef"
// word2 = "abaaacc"
// len = 7
// freq = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
// Character Frequency Counting Loop:

// First Iteration (i = 0):
// Increment freq['a' - 'a'] and decrement freq['a' - 'a'].
// Second Iteration (i = 1):
// Increment freq['b' - 'a'] and decrement freq['b' - 'a'].
// Third Iteration (i = 2):
// Increment freq['c' - 'a'] and decrement freq['a' - 'a'].
// Fourth Iteration (i = 3):
// Increment freq['d' - 'a'] and decrement freq['a' - 'a'].
// Fifth Iteration (i = 4):
// Increment freq['e' - 'a'] and decrement freq['a' - 'a'].
// Sixth Iteration (i = 5):
// Increment freq['e' - 'a'] and decrement freq['a' - 'a'].
// Seventh Iteration (i = 6):
// Increment freq['f' - 'a'] and decrement freq['c' - 'a'].
// Check Frequency Differences:

// Check if the absolute frequency difference is at most 3 for each character.
// First Iteration (i = 0):
// Check if Math.abs(freq[0]) (frequency of 'a') is greater than 3. It is not, continue to the next character.
// Continue this process for other characters.
// Result:

// The function returns true because the absolute frequency difference for each character is at most 3.
// Explanation: The code checks whether two words are almost equivalent by counting the frequency of characters in both words and ensuring 
//that the absolute difference in frequency for each character is at most 3. 
//In this specific case, for the input word1 = "abcdeef", word2 = "abaaacc", the output is true because the words are considered almost equivalent based on the defined criteria.






