class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Frequency array for 26 lowercase English letters
        int[] counts = new int[26];
        
        // Count all available characters in the magazine
        for (char c : magazine.toCharArray()) {
            counts[c - 'a']++;
        }
        
        // Check if we have enough characters for the ransom note
        for (char c : ransomNote.toCharArray()) {
            counts[c - 'a']--;
            
            // If the count drops below 0, the magazine didn't have enough of this char
            if (counts[c - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}
