class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;
        
        for (int i = 0; i < num.length(); i++) {
            // Convert character digit to integer
            int digit = num.charAt(i) - '0';
            
            // Check if index is even or odd
            if (i % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        
        // Return true if sums are equal
        return evenSum == oddSum;
    }
}
