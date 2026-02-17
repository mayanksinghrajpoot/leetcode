class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;

        // Traverse both arrays using two pointers
        while (i < n1 && j < n2) {
            if (nums1[i] == nums2[j]) {
                // Since arrays are sorted, the first match found is the minimum
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                // Move the pointer of the smaller element forward
                i++;
            } else {
                j++;
            }
        }

        // Return -1 if no common element is found
        return -1;
    }
}
