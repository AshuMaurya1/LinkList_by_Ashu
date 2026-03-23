public class LeetCodeProblem3642 {
    static class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m = grid.length;
        int n = grid[0].length; 
        int[][] result = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                result[i][j] = grid[i][j];
            }
        }
        for(int i = 0; i < k; i++){
            for(int j = 0; j < k; j++){
                result[x + i][y + j] = grid[x + k - 1 - i][y + k - 1 - j];
            }
        }
        return result;
    }
}
    public static void main(String[] args) {
        LeetCodepPro3567 solution = new LeetCodepPro3567();
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 2;
        int[][] result = solution.minAbsDiff(grid, k);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        int ans = result[1][1];
        System.out.println(ans);
    }
}
