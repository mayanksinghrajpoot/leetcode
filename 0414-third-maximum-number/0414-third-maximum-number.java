class Solution {
    public int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (Integer n : nums) {
            long val = n.longValue();

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

        return (third == null) ? first.intValue() : third.intValue();
    }
}
