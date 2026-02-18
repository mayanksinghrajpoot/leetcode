class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalElements = n * n;
        // Frequency array size is n^2 + 1 to accommodate numbers from 1 to n^2
        int[] count = new int[totalElements + 1];
        
        int repeated = -1;
        int missing = -1;

        // Traverse the grid and update the frequency map
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        // Check the frequency map to find the repeated and missing values
        for (int i = 1; i <= totalElements; i++) {
            if (count[i] == 2) {
                repeated = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}
