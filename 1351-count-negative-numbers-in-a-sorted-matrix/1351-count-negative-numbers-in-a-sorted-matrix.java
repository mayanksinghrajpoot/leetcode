class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        
        // Start from the top-right corner
        int r = 0;
        int c = cols - 1;
        
        while (r < rows && c >= 0) {
            if (grid[r][c] < 0) {
                // If grid[r][c] is negative, then all elements below it 
                // in the same column are also negative.
                count += (rows - r);
                // Move left to check the previous column
                c--;
            } else {
                // If grid[r][c] is non-negative, move down to the next row
                r++;
            }
        }
        
        return count;
    }
}
