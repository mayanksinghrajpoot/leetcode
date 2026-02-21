class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num : nums) {
            if (num < 10) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }

        // Alice wins if either sum is strictly greater than the other sum
        // (the sum she didn't pick). This is equivalent to checking 
        // if the two sums are not equal.
        return singleDigitSum != doubleDigitSum;
    }
}
