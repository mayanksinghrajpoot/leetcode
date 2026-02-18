class Solution {
    public int findLucky(int[] arr) {
        // Frequency array for values 1 to 500
        int[] count = new int[501];
        
        // Count occurrences of each number
        for (int num : arr) {
            count[num]++;
        }
        
        // Iterate backwards from 500 to 1 to find the largest lucky number
        for (int i = 500; i >= 1; i--) {
            if (count[i] == i) {
                return i;
            }
        }
        
        // No lucky integer found
        return -1;
    }
}
