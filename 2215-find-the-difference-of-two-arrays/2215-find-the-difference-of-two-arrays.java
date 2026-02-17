import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Step 1: Use Sets to store unique elements of both arrays for O(1) lookup
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        // Step 2: Find elements in set1 that are NOT in set2
        for (int n : set1) {
            if (!set2.contains(n)) {
                result.get(0).add(n);
            }
        }

        // Step 3: Find elements in set2 that are NOT in set1
        for (int n : set2) {
            if (!set1.contains(n)) {
                result.get(1).add(n);
            }
        }

        return result;
    }
}
