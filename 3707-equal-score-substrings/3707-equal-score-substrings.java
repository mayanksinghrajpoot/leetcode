class Solution {
    public boolean scoreBalance(String s) {
        int totalScore = 0;
        int n = s.length();
        
        // Calculate total score of the string
        // Each character score is (char - 'a' + 1)
        for (int i = 0; i < n; i++) {
            totalScore += (s.charAt(i) - 'a' + 1);
        }
        
        // If total score is odd, it's impossible to split into two equal integers
        if (totalScore % 2 != 0) {
            return false;
        }
        
        int target = totalScore / 2;
        int currentScore = 0;
        
        // Iterate through the string to find a split point
        // Must leave at least one character for the second substring (i < n - 1)
        for (int i = 0; i < n - 1; i++) {
            currentScore += (s.charAt(i) - 'a' + 1);
            
            if (currentScore == target) {
                return true;
            }
            
            // Optimization: if we pass the target, no need to keep adding
            if (currentScore > target) {
                return false;
            }
        }
        
        return false;
    }
}
