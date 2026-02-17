class Solution {
    public int maximumDifference(int[] nums) {
        // Initialize max difference as -1 (default if no valid pair is found)
        int maxDiff = -1;
        // Keep track of the minimum element encountered so far
        int minVal = nums[0];
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > minVal) {
                // Update max difference if current difference is larger
                maxDiff = Math.max(maxDiff, nums[j] - minVal);
            } else {
                // Update the minimum value if a new smaller element is found
                minVal = nums[j];
            }
        }
        
        return maxDiff;
    }
}
