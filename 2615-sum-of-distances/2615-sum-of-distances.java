class Solution {
    public long[] distance(int[] nums) {
        long[] arr=new long[nums.length];
        HashMap<Integer,ArrayList<Integer>> list=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            list.put(nums[i],new ArrayList<>());
        }
        for(int i=0;i<nums.length;i++){
            list.get(nums[i]).add(i);
        }
        for(ArrayList<Integer> indices:list.values()){
            int groupSize = indices.size();
            long totalGroupSum = 0;
        for (int idx : indices) totalGroupSum += idx;

        long runningLeftSum = 0;

        for (int i = 0; i < groupSize; i++) {
            long currIdx = indices.get(i);
            long rightSum = totalGroupSum - runningLeftSum - currIdx;
            long leftTotalDist = (i * currIdx) - runningLeftSum;
            long rightTotalDist = rightSum - (long)(groupSize - i - 1) * currIdx;
            arr[(int)currIdx] = leftTotalDist + rightTotalDist;
            runningLeftSum += currIdx;
        }}
        
        return arr;
    }
}