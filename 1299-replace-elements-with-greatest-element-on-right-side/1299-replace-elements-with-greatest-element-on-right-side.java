class Solution {
    public int[] replaceElements(int[] arr) {
        // Start with -1 as there are no elements to the right of the last element
        int maxOfRight = -1;
        
        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            int currentVal = arr[i]; // Store original value before overwriting
            arr[i] = maxOfRight;    // Replace current element with max seen to its right
            maxOfRight = Math.max(maxOfRight, currentVal); // Update max for next element
        }
        
        return arr;
    }
}
