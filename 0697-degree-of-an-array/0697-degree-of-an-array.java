import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>();   // First index of each element
        Map<Integer, Integer> right = new HashMap<>();  // Last index of each element
        Map<Integer, Integer> count = new HashMap<>();  // Frequency of each element
        
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (!left.containsKey(x)) left.put(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
            degree = Math.max(degree, count.get(x));
        }
        
        int minLength = nums.length;
        for (int x : count.keySet()) {
            // Only check elements that reach the maximum frequency
            if (count.get(x) == degree) {
                // Shortest subarray for element x spans from its first to last occurrence
                minLength = Math.min(minLength, right.get(x) - left.get(x) + 1);
            }
        }
        
        return minLength;
    }
}
