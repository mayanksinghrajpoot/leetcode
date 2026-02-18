class Solution {
    public int firstUniqChar(String s) {
        // Since there are only 26 lowercase English letters
        int[] count = new int[26];
        
        // First pass: Build the frequency map
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        // Second pass: Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        // If no unique character exists
        return -1;
    }
}
