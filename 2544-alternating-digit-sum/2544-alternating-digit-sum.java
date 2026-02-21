class Solution {
    public int alternateDigitSum(int n) {
        int totalSum = 0;
        int sign = 1;
        // Convert number to string to process from left to right
        String s = String.valueOf(n);
        
        for (int i = 0; i < s.length(); i++) {
            // Convert character back to numeric digit
            int digit = s.charAt(i) - '0';
            totalSum += sign * digit;
            // Flip the sign for the next digit
            sign *= -1;
        }
        
        return totalSum;
    }
}
