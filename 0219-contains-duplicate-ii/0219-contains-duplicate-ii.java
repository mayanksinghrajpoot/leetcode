class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in the set, we found a duplicate within distance k
            if (set.contains(nums[i])) {
                return true;
            }
            
            // Add current element to the set
            set.add(nums[i]);
            
            // If set size exceeds k, remove the oldest element (at index i - k)
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}
