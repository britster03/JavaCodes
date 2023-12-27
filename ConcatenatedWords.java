class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> hs = new HashSet<>();
        Map<String, Boolean> hm = new HashMap<>();
        
        // Add words to HashSet for quick lookup
        for (String word : words) {
            hs.add(word);
        }
        
        List<String> result = new ArrayList<>();
        
        // Check each word in the input
        for (int i = 0; i < words.length; i++) {
            // If the word is a concatenated word, add it to the result list
            if (isConcatenated(words[i], hs, hm)) {
                result.add(words[i]);
            }
        }
        
        return result;
    }
    
    public static boolean isConcatenated(String word, Set<String> st, Map<String, Boolean> hm) {
        // Check if the word is already computed
        if (hm.containsKey(word)) {
            return hm.get(word);
        }
        
        // Try all possible prefixes and suffixes
        for (int i = 0; i < word.length(); i++) {
            String prefix = word.substring(0, i + 1);
            String suffix = word.substring(i + 1, word.length());
            
            // Check if the prefix is in the set and if the suffix is a concatenated word
            if ((st.contains(prefix) && st.contains(suffix)) || (st.contains(prefix) && isConcatenated(suffix, st, hm))) {
                hm.put(word, true);
                return true;
            }
        }
        
        // No valid concatenation found
        hm.put(word, false);
        return false;
    }
}



// Initialization:

// words = ["cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"]
// hs is a HashSet to store words for quick lookup.
// hm is a HashMap to store computed results of words.
// result is an ArrayList to store the concatenated words.
// Outer Loop:

// Iterate through each word in the input array.
// First Iteration (word = "cat"):
// Skip because it's not a concatenated word.
// Second Iteration (word = "cats"):
// Skip because it's not a concatenated word.
// Continue this loop for all words.
// Inner Method (isConcatenated):

// Check if the word is already computed using the HashMap (hm).
// First Iteration (`isConcatenated("catsdogcats", hs, hm)"):
// Check all possible prefixes and suffixes.
// Prefix = "c", Suffix = "atsdogcats".
// Check if "c" is in the set (hs) and if "atsdogcats" is a concatenated word (recursive call).
// Recursive call (isConcatenated("atsdogcats", hs, hm)).
// Prefix = "a", Suffix = "tsdogcats".
// Check if "a" is in the set (hs) and if "tsdogcats" is a concatenated word (recursive call).
// ... Continue this process until a valid concatenation is found.
// Update hm with the result.
// Continue this process for other words.
// Result:

// The words "catsdogcats", "dogcatsdog", and "ratcatdogcat" are found to be concatenated words and added to the result list.
// Returning Result:

// Return the result list containing the concatenated words.
// Explanation: The code uses a recursive approach to check if a word can be formed by concatenating other words from the given list. 
//The HashSet (hs) is used for quick lookup of words, and the HashMap (hm) is used to store previously computed results. 
//The result is a list of words that can be formed by concatenating other words from the input list. 
//In this specific case, the output is ["catsdogcats", "dogcatsdog", "ratcatdogcat"].