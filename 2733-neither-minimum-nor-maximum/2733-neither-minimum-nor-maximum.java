class Solution {
    public int findNonMinOrMax(int[] nums) {
        // if(nums.length==1 || nums.length==2)return -1;
        int h=nums[0],l=nums[0];
        for(int i=0;i<nums.length;i++){
            if(h<nums[i])h=nums[i];
            if(l>nums[i])l=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<h && nums[i]>l){
                return nums[i];
            }
        }
        return -1;
    }
}