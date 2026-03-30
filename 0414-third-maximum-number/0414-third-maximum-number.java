class Solution {
    public int thirdMax(int[] nums) {
        // Use Long to handle the case where Integer.MIN_VALUE is in the array
        Long first = null;
        Long second = null;
        Long third = null;

        for (Integer n : nums) {
            long val = n.longValue();

            // Skip if we've already accounted for this number (distinct check)
            if ((first != null && val == first) || 
                (second != null && val == second) || 
                (third != null && val == third)) {
                continue;
            }

            if (first == null || val > first) {
                third = second;
                second = first;
                first = val;
            } else if (second == null || val > second) {
                third = second;
                second = val;
            } else if (third == null || val > third) {
                third = val;
            }
        }

        // If the third max doesn't exist, return the first max
        return (third == null) ? first.intValue() : third.intValue();
    }
}
