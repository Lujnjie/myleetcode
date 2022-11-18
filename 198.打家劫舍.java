/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        // 1 dp[0];2 max(nums[0],nums[1]);3 max(dp[0]+nums[2],dp[1])
        // 状态转移方程 1 2 3 4 5 6
        // dp[i] = max(dp[i-2]+nums[i],dp[i-1])
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        // int left = 0;
        // int right = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if(i == 0) {
        //         left = nums[0];
        //     } else if(i == 1) {
        //         right = Math.max(nums[0], nums[1]);
        //     } else {
        //         int tmp = right;
        //         right = Math.max(left + nums[i], right);
        //         left = tmp;
        //     }
        // }

        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i == 0) {
                dp[0] = nums[0];
            } else if(i == 1) {
                dp[1] = Math.max(nums[0], nums[1]);
            } else {
                dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
            }
        }

        return dp[nums.length - 1];
    }
}
// @lc code=end

