class Solution {
    static boolean isSafe(int i, int j, int n, int m) {
        return (i >= 0 && i < n && j >= 0 && j < m);
    }

    public int orangesRotting(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // queue to store coordinates of rotten oranges
        Queue<int[]> q = new LinkedList<>();

        // counter of elapsed time
        int elapsedTime = 0;

        // push all initially rotten oranges into queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
            }
        }

        // directions for all four adjacent cells
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        // perform BFS
        while (!q.isEmpty()) {
            int size = q.size();
            boolean flag = false; 

            // process all oranges at current time level
            for (int i = 0; i < size; i++) {
                int[] cell = q.poll();
                int x = cell[0];
                int y = cell[1];

                // check all four directions
                for (int[] dir : directions) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    // if cell is safe and has fresh orange
                    if (isSafe(nx, ny, n, m) && mat[nx][ny] == 1) {
                        // rot the orange
                        mat[nx][ny] = 2;
                        q.add(new int[]{nx, ny});
                        flag = true;
                    }
                }
            }

            // if at least one orange got rotten, increase the time
            if (flag)
                elapsedTime++;
        }

        // check if any fresh orange still remains
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1)
                    return -1;
            }
        }

        return elapsedTime;
    }
}
