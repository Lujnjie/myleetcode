/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        // return (num - 1) % 9 + 1;
        // 100*a + 10*b + c -> a + b + c
        if(num > 0) {
            num = num % 9;
            return num == 0? 9 : num;
        }
        return num;
    }
}
// @lc code=end

