class Solution {
    public int countCharacters(String[] words, String chars) {
        // Step 1: Build a frequency map for the available characters
        int[] availableCounts = new int[26];
        for (char c : chars.toCharArray()) {
            availableCounts[c - 'a']++;
        }

        int totalLength = 0;

        // Step 2: Check each word individually
        for (String word : words) {
            int[] wordCounts = new int[26];
            boolean canForm = true;

            for (char c : word.toCharArray()) {
                wordCounts[c - 'a']++;
                // If we need more of a character than we have, this word is invalid
                if (wordCounts[c - 'a'] > availableCounts[c - 'a']) {
                    canForm = false;
                    break;
                }
            }

            // If the word is "good," add its length to the total
            if (canForm) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }
}
