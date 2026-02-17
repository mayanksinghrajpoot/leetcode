class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int first = cost[0];
        int second = cost[1];
        
        // Start from step 2 since we can start at index 0 or 1
        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(first, second);
            first = second;
            second = current;
        }
        
        // The answer is the minimum of the last two steps to reach the top
        return Math.min(first, second);
    }
}
