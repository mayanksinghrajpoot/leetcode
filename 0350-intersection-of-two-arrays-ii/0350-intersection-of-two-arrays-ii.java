import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Step 1: Count frequencies of the smaller array to save space
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums1) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> intersection = new ArrayList<>();
        // Step 2: Iterate through the second array and find matches
        for (int num : nums2) {
            if (counts.getOrDefault(num, 0) > 0) {
                intersection.add(num);
                // Reduce the count to handle duplicates correctly
                counts.put(num, counts.get(num) - 1);
            }
        }
        
        // Step 3: Convert the result list back to an array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        
        return result;
    }
}
