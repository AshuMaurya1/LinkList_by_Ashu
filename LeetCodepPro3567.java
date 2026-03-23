public class LeetCodepPro3567 {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] result = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int minDiff = Integer.MAX_VALUE;

                for(int x = Math.max(0, i - k); x <= Math.min(m - 1, i + k); x++){
                    for(int y = Math.max(0, j - k); y <= Math.min(n - 1, j + k); y++){
                        if(x == i && y == j) continue; 
                        minDiff = Math.min(minDiff, Math.abs(grid[i][j] - grid[x][y]));
                    }
                }
                result[i][j] = minDiff;
            }

        
    }
        return result;
    }
}

