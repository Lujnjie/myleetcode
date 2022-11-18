/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        while(i >= 0 || j >=0 || carry > 0) {
            // ascii码计算, 字符转成数字的ascii码
            int a = i < 0 ? 0 : num1.charAt(i--) - '0';
            int b = j < 0 ? 0 : num2.charAt(j--) - '0';

            carry += (a + b);
            result.append(carry%10);
            carry /= 10;
        } 
        return result.reverse().toString();
    }
}
// @lc code=end

