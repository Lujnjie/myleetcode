import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/*
 * @lc app=leetcode.cn id=220 lang=java
 *
 * [220] 存在重复元素 III
 */

// @lc code=start
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            // 大于等于xx的最大的数
            Integer s = set.ceiling(nums[i]);
            if (s != null && s - nums[i] <= t) return true;
    
            // 小于等于xx的最小的数
            Integer g = set.floor(nums[i]);
            if (g != null && nums[i] - g <= t) return true;
    
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    // public static void main(String[] args) {
    //     containsNearbyAlmostDuplicate(new int[]{-2147483648,2147483647}, 1, 1);
    // }

}
// @lc code=end

