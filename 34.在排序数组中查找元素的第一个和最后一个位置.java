/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = search(nums, target);
        int r = search(nums, target+1);
        return l == r ? new int[]{-1,-1} : new int[]{l, r-1} ;

    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length;
        while(left < right) {
            int mid = (left + right) >>> 1;
            if(nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
// @lc code=end

