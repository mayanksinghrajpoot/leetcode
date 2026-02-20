class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
            } else {
                // Update max and reset current streak
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        
        // Final check in case the array ends with a 1
        return Math.max(maxCount, currentCount);
    }
}
