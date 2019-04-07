package arrays;

import java.util.Arrays;

public class Minimum_Path_Sum_64 {
    public static void main(String[] args) {

    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        dp[0][0] = grid[0][0];
        for (int i = 0; i < n; i++) {
            dp[i][0] = grid[i][0];
        }
        for (int i = 0; i < m; i++) {
            dp[0][i] = grid[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j])+grid[i][j];
            }
        }
        return dp[n-1][m-1];

    }
}
