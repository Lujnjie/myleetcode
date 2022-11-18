/*
 * @lc app=leetcode.cn id=304 lang=java
 *
 * [304] 二维区域和检索 - 矩阵不可变
 */

// 方法一：二维前缀和
// s[i + 1][j + 1] 表示第 i 行第 j 列左上部分所有元素之和，其中 i, j 下标从 0 开始。
// 则 s[i + 1][j + 1] = s[i + 1][j] + s[i][j + 1] - s[i][j] + nums[i][j]。
// 以 (x1, y1) 为左上角，(x2, y2) 为右下角的子矩阵和 sub = s[x2 + 1][y2 + 1] - s[x2 + 1][y1] - s[x1][y2 + 1] + s[x1][y1]。
// @lc code=start
class NumMatrix {
    int[][] s;
    public NumMatrix(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;
        s = new int[col+1][row+1];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                s[i + 1][j + 1] = s[i + 1][j] + s[i][j + 1] - s[i][j] + matrix[i][j];
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return s[row2 + 1][col2 + 1] - s[row2 + 1][col1] - s[row1][col2 + 1] + s[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
// @lc code=end

