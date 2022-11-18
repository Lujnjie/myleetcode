/*
 * @lc app=leetcode.cn id=190 lang=java
 *
 * [190] 颠倒二进制位
 */

// class SolutionTest {
//     // 123,  12 3  1 2
//     public static int reverseNums(int n) {
//         int sum = 0;
//         while(n % 10 != 0) {
//            sum = sum * 10 + n % 10;
//            n = n / 10; 
//         }
//         return sum;
//     }

//     public static int reverseBits(int n) {
//         int sum = 0;

//         for (int i = 0; i < 32; i++) {
//             sum = sum + ((n & 1) << (31-i));
//             int a = n % 2;
//             int b = n & 1;
//             n = n >> 1;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         reverseNums(123);
//         // reverseBits(11111111111111111111111111111101);
//     }
// }

// @lc code=start
class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int sum = 0;

        for (int i = 0; i < 32; i++) {
            sum = sum + (((n >> i) & 1) << (31-i));
            n = n >> 1;
        }
        return sum;
    }
}
// @lc code=end

