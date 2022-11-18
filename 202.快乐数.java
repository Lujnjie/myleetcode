import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// class SolutionTest {
//     public static boolean isHappy(int n) {
//         // HashSet<Integer> sets = new HashSet<>();
//         // while(n != 0 && !sets.contains(n)) {
//         //     sets.add(n);    
//         //     n = getNext(n);
//         // }
//         // return n == 1 ? true : false;
//         int fast = n;
//         int slow = n;
//         do {
//             slow = getNext(slow);
//             fast = getNext(fast);
//             fast = getNext(fast);
//         } while (fast != slow);
//         return fast == 1 ? true : false;
//     }

//     public static int getNext(int n) {
//         int sum = 0;
//         while(n != 0) {
//             sum = sum + (n % 10) * (n % 10);
//             n = n / 10;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         isHappy(2);
//     }
// }

// @lc code=start
class Solution {
    public static boolean isHappy(int n) {
        // HashSet<Integer> sets = new HashSet<>();
        // while(n != 0 && !sets.contains(n)) {
        //     sets.add(n);
        //     n = getNext(n);
        // }
        // return n == 1 ? true : false;
        int fast = n;
        int slow = n;
        do {
            slow = getNext(slow);
            fast = getNext(fast);
            fast = getNext(fast);
        } while (fast != slow);
        return fast == 1 ? true : false;
    }

    public static int getNext(int n) {
        int sum = 0;
        while(n != 0) {
            sum = sum +  (int) Math.pow((n % 10), 2);
            n = n / 10;
        }
        return sum;
    }
}
// @lc code=end

