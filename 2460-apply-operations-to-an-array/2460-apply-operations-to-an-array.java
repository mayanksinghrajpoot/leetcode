class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        
        // Step 1: Apply operations sequentially
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;    // Double the current element
                nums[i + 1] = 0; // Set the next element to zero
            }
        }
        
        // Step 2: Shift all non-zero elements to the front (move zeroes to end)
        int[] result = new int[n];
        int nonZeroIdx = 0;
        for (int num : nums) {
            if (num != 0) {
                result[nonZeroIdx++] = num;
            }
        }
        
        // Remaining elements in 'result' are already 0 by default in Java
        return result;
    }
}
