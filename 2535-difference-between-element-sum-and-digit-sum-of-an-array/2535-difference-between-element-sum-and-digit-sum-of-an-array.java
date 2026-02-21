class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            // Add to element sum
            elementSum += num;

            // Add each digit to digit sum
            int temp = num;
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }
        }

        // Return the absolute difference
        return Math.abs(elementSum - digitSum);
    }
}
