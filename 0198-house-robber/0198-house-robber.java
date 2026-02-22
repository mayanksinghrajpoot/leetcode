class Solution {
    int[] arr=new int[101];
    public int solve(int[] num,int i,int n){
        if(i>=n)return 0;
        if(arr[i]!=-1)return arr[i];
        int steal =num[i]+solve(num,i+2,n);
        int skip=solve(num,i+1,n);

        return arr[i]=(steal>skip)?steal:skip;
    }
    public int rob(int[] nums) {
        Arrays.fill(arr,-1);
        return solve(nums,0,nums.length);
    }
}