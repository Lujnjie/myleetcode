/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            count = nums[i] == candidate ? count +1 : count -1;
            if(count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        System.out.println(124);
    }
}
// @lc code=end

