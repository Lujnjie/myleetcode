import java.util.Arrays;

class Solution1234 {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1) {
            return nums[0];
        }
        int item = nums[0];
        int c = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != item){
                if(c == 1) {
                    return item;
                }
                c = 1;
                item = nums[i];
            } else {
                c ++;
            }
        }
        return item;
    
    }
    public static void main(String[] args) {
        int[] nums = {-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354};
        singleNumber(nums);
    }
}

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1) {
            return nums[0];
        }
        int item = nums[0];
        int c = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != item){
                if(c == 1) {
                    return item;
                }
                c = 1;
                item = nums[i];
            } else {
                c ++;
            }
        }
        return item;

        // int single = 0;
        // for (int num : nums) {
        //     single ^= num;
        // }
        // return single;
    
    }
}
// @lc code=end

