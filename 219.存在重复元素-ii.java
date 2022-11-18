import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0) {
            return false;
        }
        // for(int head = 0; head <= Math.min(head+k, nums.length-1); head ++) {
        //     int target = nums[head];
        //     for (int i = head+1; i <= Math.min(head+k, nums.length-1); i++) {
        //         if(nums[i] == target) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        Map<Integer, Integer> tMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer target = nums[i];
            if(!tMap.containsKey(target)) {
                tMap.put(target, i);
            } else if(i - tMap.get(target) <= k) {
                return true;
            } else {
                tMap.put(target, i);
            }
        }
        return false;
    }
}
// @lc code=end

