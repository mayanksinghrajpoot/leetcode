class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        // Pointer to the last non-equal element on the left
        int left = nums[0];

        // Iterate from the second element to the second-to-last
        for (int i = 1; i < nums.length - 1; i++) {
            // If current is same as next, it's a plateau; skip until the end of it
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            // Check if it's a Hill
            if (nums[i] > left && nums[i] > nums[i + 1]) {
                count++;
            } 
            // Check if it's a Valley
            else if (nums[i] < left && nums[i] < nums[i + 1]) {
                count++;
            }

            // Update left neighbor for the next iteration's comparison
            left = nums[i];
        }

        return count;
    }
}
