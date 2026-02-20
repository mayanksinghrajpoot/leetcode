class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        // Encode: Add (bitCount * large constant) to each number
        for (int i = 0; i < n; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }
        
        // Sort based on the encoded value
        Arrays.sort(arr);
        
        // Decode: Retrieve the original number
        for (int i = 0; i < n; i++) {
            arr[i] %= 10001;
        }
        
        return arr;
    }
}
