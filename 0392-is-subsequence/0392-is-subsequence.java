class Solution {
    public boolean isSubsequence(String s, String t) {
        // Pointers for s and t
        int i = 0, j = 0;

        // Iterate through both strings
        while (i < s.length() && j < t.length()) {
            // If characters match, move the pointer for s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move the pointer for t
            j++;
        }

        // If i reached the end of s, it means all characters were found in order
        return i == s.length();
    }
}
