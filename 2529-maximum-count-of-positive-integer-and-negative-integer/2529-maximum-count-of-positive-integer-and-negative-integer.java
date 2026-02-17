class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        
        // Find the index of the first element >= 0 (first non-negative)
        // All elements before this index are negative.
        int firstNonNegative = lowerBound(nums, 0);
        
        // Find the index of the first element > 0 (first positive)
        // All elements from this index to the end are positive.
        int firstPositive = lowerBound(nums, 1);
        
        int negCount = firstNonNegative;
        int posCount = n - firstPositive;
        
        return Math.max(negCount, posCount);
    }

    // Helper: Finds the first index where nums[i] >= target
    private int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
