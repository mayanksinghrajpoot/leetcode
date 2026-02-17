class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // Based on constraints (0 <= nums[i] < n, where n <= 100)
        int[] counts = new int[101]; 
        int[] result = new int[2];
        int foundCount = 0;

        for (int num : nums) {
            counts[num]++;
            // If we've seen this number for the second time, it's sneaky!
            if (counts[num] == 2) {
                result[foundCount++] = num;
                // If we've found both sneaky numbers, we can stop early
                if (foundCount == 2) break;
            }
        }
        return result;
    }
}
