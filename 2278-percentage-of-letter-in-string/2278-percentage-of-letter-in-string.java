class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        int n = s.length();
        
        // Count occurrences of the letter
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }
        
        // Calculate percentage: (count * 100) / total_length
        // Integer division in Java automatically rounds down (floors)
        return (count * 100) / n;
    }
}
