import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> wordCounts = new HashMap<>();
        
        // Combine and split sentences by space
        // Standard split(" ") is O(N) where N is the string length
        for (String word : (s1 + " " + s2).split(" ")) {
            // merge() increments count by 1 or initializes to 1
            wordCounts.merge(word, 1, Integer::sum);
        }
        
        List<String> result = new ArrayList<>();
        // Find words that appeared exactly once total
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        // Convert the list back to an array
        return result.toArray(new String[0]);
    }
}
