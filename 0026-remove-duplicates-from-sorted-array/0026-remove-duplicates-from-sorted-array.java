class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        int f=1;
        while(f<nums.length){
            if(nums[f]!=nums[c]){
                c++;
                nums[c]=nums[f];
            }
            f++;
        }
        return ++c;
    }
}