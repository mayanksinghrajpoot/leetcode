class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            // log10(n) + 1 gives the number of digits
            if (((int) Math.log10(num) + 1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
