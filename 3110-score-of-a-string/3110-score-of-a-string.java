class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        
        // Iterate through the string from the first to the second-to-last character
        for (int i = 0; i < s.length() - 1; i++) {
            // Calculate absolute difference between ASCII values of adjacent characters
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        
        return score;
    }
}
