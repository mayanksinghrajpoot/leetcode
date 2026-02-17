class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;
        
        // If n is odd, include 0 to keep the sum at zero
        if (n % 2 != 0) {
            result[index++] = 0;
        }
        
        // Add pairs (1, -1), (2, -2), etc. until the array is full
        for (int i = 1; index < n; i++) {
            result[index++] = i;
            result[index++] = -i;
        }
        
        return result;
    }
}
