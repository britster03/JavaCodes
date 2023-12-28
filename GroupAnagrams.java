class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to store anagrams, where the key is the sorted word and the value is a list of anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate through each word in the input array
        for (String word : strs) {
            // Convert the word to a character array, sort it, and create a sorted string
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            // Check if the sorted word is already in the map
            if (!map.containsKey(sortedWord)) {
                // If not, add a new entry to the map with an empty list
                map.put(sortedWord, new ArrayList<>());
            }
            
            // Add the original word to the list of anagrams for the sorted word
            map.get(sortedWord).add(word);
        }
        
        // Return a list of lists containing the grouped anagrams
        return new ArrayList<>(map.values());
    }
}



// Initialization:

// strs = ["eat","tea","tan","ate","nat","bat"]
// map is a HashMap to store anagrams.
// Main Loop:

// First Iteration (word = "eat"):
// Sort the characters of "eat" to get "aet".
// Check if "aet" is already a key in the map. It's not, so add it with an empty list.
// Add "eat" to the list associated with the key "aet".
// Second Iteration (word = "tea"):
// Sort the characters of "tea" to get "aet".
// "aet" is already a key in the map, so add "tea" to the existing list.
// Continue this process for the remaining words.
// Result:

// After processing all words, the map contains the following entries:
// "aet" -> ["eat", "tea", "ate"]
// "ant" -> ["tan", "nat"]
// "abt" -> ["bat"]
// Convert the values of the map to a list of lists to obtain the final result.
// Returning Result:

// The function returns new ArrayList<>(map.values()), which is a list of lists containing grouped anagrams:
// [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
// Explanation: The code groups anagrams from the input array by sorting the characters of each word and using the sorted version as a key in a map. The values of the map are lists of words that are anagrams of each other. In this specific case, for the input strs = ["eat","tea","tan","ate","nat","bat"], the output is a list of lists containing grouped anagrams.



// // Return a list of lists containing the grouped anagrams
// return new ArrayList<>(map.values());


// In this step, the map.values() method is used to obtain a Collection<List<String>> representing all the values in the map, where each value is a list of anagrams corresponding to a specific key (sorted word). Then, a new ArrayList is created using the ArrayList(Collection<? extends E> c) constructor, which takes a collection as an argument and initializes the list with the elements of that collection.

// Let's break down this step with the example input strs = ["eat","tea","tan","ate","nat","bat"]:

// After processing all words in the input array, the map (map) contains the following entries:

// "aet" -> ["eat", "tea", "ate"]
// "ant" -> ["tan", "nat"]
// "abt" -> ["bat"]
// map.values() returns a collection of lists:

// values = [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
// new ArrayList<>(values) creates a new ArrayList using the constructor that takes a collection as an argument. The resulting list is:

// result = [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
// The function then returns this list as the final result.

// Explanation: The purpose of this step is to convert the values of the map (lists of anagrams) into a list of lists, which represents the grouped anagrams. The resulting list is returned as the output of the groupAnagrams function. In the given example, the output is result = [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]. Each inner list contains words that are anagrams of each other.