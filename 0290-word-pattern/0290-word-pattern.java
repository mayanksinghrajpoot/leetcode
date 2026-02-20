import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        // If lengths don't match, they can't follow the pattern
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Check if character already has a different mapping
            if (charToWord.containsKey(c) && !charToWord.get(c).equals(word)) {
                return false;
            }
            
            // Check if word already has a different mapping
            if (wordToChar.containsKey(word) && wordToChar.get(word) != c) {
                return false;
            }

            // Create the mapping
            charToWord.put(c, word);
            wordToChar.put(word, c);
        }

        return true;
    }
}
