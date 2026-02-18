class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];         // Fill first half
            ans[i + n] = nums[i];     // Fill second half
        }
        
        return ans;
    }
}
