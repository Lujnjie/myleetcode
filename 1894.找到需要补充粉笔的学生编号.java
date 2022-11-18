/*
 * @lc app=leetcode.cn id=1894 lang=java
 *
 * [1894] 找到需要补充粉笔的学生编号
 */

// @lc code=start
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long[] preSum = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            preSum[i + 1] = preSum[i] + chalk[i];
        }
        // 粉笔是数组循环消耗的，取余后直接进入最后一轮
        k %= preSum[n];
        
        int left = 0, right = n-1;
        while(left < right) {
            int m = (left + right) >>> 1;
            // 数组中第0位没有用，所以m+1
            long used = preSum[m+1];
            // 使用的已经超过k，需要往前找
            if (used > k) {
                right = m;
            } else {
                left = m + 1;
            }
        }
        return left;
    }
}
// @lc code=end

