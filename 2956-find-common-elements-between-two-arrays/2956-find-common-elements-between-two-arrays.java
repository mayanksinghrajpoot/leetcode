class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        // Track unique elements in both arrays (range is 1-100)
        boolean[] existIn1 = new boolean[101];
        boolean[] existIn2 = new boolean[101];

        // Mark elements present in nums1
        for (int num : nums1) {
            existIn1[num] = true;
        }

        // Mark elements present in nums2
        for (int num : nums2) {
            existIn2[num] = true;
        }

        int count1 = 0;
        int count2 = 0;

        // Count elements in nums1 that exist in nums2
        for (int num : nums1) {
            if (existIn2[num]) count1++;
        }

        // Count elements in nums2 that exist in nums1
        for (int num : nums2) {
            if (existIn1[num]) count2++;
        }

        return new int[]{count1, count2};
    }
}
