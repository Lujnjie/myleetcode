import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< nums.length;i++) {
            Integer num1 = target - nums[i];
            if(map.containsKey(num1)) {
                result[0] = map.get(num1);
                result[1] = i;
                return result;
            } else{
                map.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] r = twoSum(new int[]{1,2,3,4}, 4);
        System.out.println(r[0]);
    }
}

// @lc code=end

