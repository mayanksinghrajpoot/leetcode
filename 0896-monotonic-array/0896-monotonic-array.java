class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            // If the next element is smaller, it's no longer strictly increasing
            if (nums[i] > nums[i + 1]) {
                increasing = false;
            }
            // If the next element is larger, it's no longer strictly decreasing
            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }
            
            // Optimization: if both are false, it's definitely not monotonic
            if (!increasing && !decreasing) {
                return false;
            }
        }

        // Return true if it managed to maintain at least one property
        return increasing || decreasing;
    }
}
