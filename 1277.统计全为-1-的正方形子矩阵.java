/*
 * @lc app=leetcode.cn id=1277 lang=java
 *
 * [1277] 统计全为 1 的正方形子矩阵
 */

// @lc code=start
class Solution1277 {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
       
        int[][] dp = new int[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
               if(i == 0 || j == 0) {
                   dp[i][j] = matrix[i][j];
               } else if(matrix[i][j]==0) {
                   dp[i][j] = 0;
               } else {
                   dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1;
               }
               ans += dp[i][j];
           }
        }
        return ans;
    }
}
// @lc code=end

