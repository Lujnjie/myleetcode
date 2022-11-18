/*
 * @lc app=leetcode.cn id=1870 lang=java
 *
 * [1870] 准时到达的列车最小时速
 */

// @lc code=start
class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        return search(dist, hour);
    }

    private int search(int[] dist, double h) {
        int left = 1, right = (int) 1e7;
        
        while(left < right) {
            int m = (left + right) >>> 1;
            if(check(dist, m, h)) {
                right = m;
            } else {
                left = m + 1;
            }

        }
        return check(dist, left, h) ? left : -1;
    }

    private boolean check(int[] dist, int s, double h) {
        double result = 0;
        for (int i=0;i < dist.length; i++) {
            double cost = dist[i] * 1.0 / s;
            result += (i == dist.length - 1 ? cost : Math.ceil(cost));
        }
        return result <= h;
    }
}
// @lc code=end

