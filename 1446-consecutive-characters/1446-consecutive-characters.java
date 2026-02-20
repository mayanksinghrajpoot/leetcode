class Solution {
    public int maxPower(String s) {
        // Edge case: empty string (though constraints usually say 1 <= s.length)
        if (s == null || s.length() == 0) return 0;
        
        int maxPower = 1;
        int currentStreak = 1;

        // Start from the second character
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentStreak++;
                // Update maxPower whenever the current streak grows
                maxPower = Math.max(maxPower, currentStreak);
            } else {
                // Characters differ, reset streak to 1 for the new character
                currentStreak = 1;
            }
        }

        return maxPower;
    }
}
