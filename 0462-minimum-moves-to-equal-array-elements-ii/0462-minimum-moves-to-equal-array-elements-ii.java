class Solution {
    public int minMoves2(int[] nums) {
        // here mean is failing because we want the closest one for the minimum moves, mean perfectly fits where the increase is exponentially
        // int sum=0;
        // for(int i:nums)sum+=i;
        // int avg=sum/nums.length;
        Arrays.sort(nums);
        int med=nums[nums.length/2];
        int steps=0;
        for(int i:nums){
            steps+=Math.abs(med-i);
        }
        return steps;
    }
}