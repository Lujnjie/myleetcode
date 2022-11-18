/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution704 {
    public int search(int[] nums, int target) {
        int begin = 0;
        int end = nums.length;
        int mid = (begin + end) /2;
        while(begin < end) {
            if(target == nums[mid]) {
                return target;
            } else if(target > nums[mid]) {
                mid = (mid + end) /2;
                begin = mid+1;
            } else {
                mid = (mid + end) /2;
                end = mid;
            }
        }
        return -1;


    //    return searchTarget(0, nums.length, nums, target);
    }

    private int searchTarget(int begin, int end, int[] nums, int target) {
        if(begin == end) {
            return -1;
        }
        int mid = (begin + end)/2;
        if(nums[mid] == target) {
            return mid;
        } else if(nums[mid] > target) {
            return searchTarget(begin, mid, nums, target);
        } else {
            return searchTarget(mid, end, nums, target);
        }
        
    }
    public static void main(String[] args) {
        Solution704 s = new Solution704();
        int[] nums = {-1,0,3,5,9,12};
        int res = s.search(nums, 9);
        System.out.println(res);
    }
}
// @lc code=end

