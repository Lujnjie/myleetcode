import java.util.*;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;
        // [-1,0,1,2,-1,-4], [-1,-1,0,1,2,4]
        for (int i = 0; i < length - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j = i + 1; j < length - 1; j++) {
                if(j > i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int h = length - 1;
                int target = -(nums[i]+nums[j]);
                while(j < h && nums[h] > target) {
                    h--;
                }

                if(j == h) {
                    break;
                }
                
                if(nums[h] == target) {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[h]);
                    res.add(l);
                }
            }
        }
        return res;
    }
}
// @lc code=end

