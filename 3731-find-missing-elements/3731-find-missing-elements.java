import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // 1. Identify the range bounds
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
            numSet.add(num);
        }

        // 2. Identify missing elements in the range [minVal, maxVal]
        List<Integer> missing = new ArrayList<>();
        for (int i = minVal; i <= maxVal; i++) {
            if (!numSet.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }
}
