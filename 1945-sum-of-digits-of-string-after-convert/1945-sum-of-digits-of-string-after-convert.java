class Solution {
    public int getLucky(String s, int k) {
        // Step 1: Convert string to initial digit sum
        // Instead of building a massive string, we can sum digits immediately
        int currentSum = 0;
        for (char c : s.toCharArray()) {
            int val = c - 'a' + 1;
            // A position like 26 has digits 2 and 6
            while (val > 0) {
                currentSum += val % 10;
                val /= 10;
            }
        }
        
        // Step 2: Perform the remaining k-1 transformations
        // We already did the first "transform" during the conversion step
        for (int i = 1; i < k; i++) {
            int nextSum = 0;
            while (currentSum > 0) {
                nextSum += currentSum % 10;
                currentSum /= 10;
            }
            currentSum = nextSum;
            
            // Optimization: if it's already a single digit, further sums won't change it
            if (currentSum < 10) break;
        }
        
        return currentSum;
    }
}
