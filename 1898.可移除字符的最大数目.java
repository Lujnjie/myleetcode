import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1898 lang=java
 *
 * [1898] 可移除字符的最大数目
 */

// @lc code=start
class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int left = 0, right = removable.length;
        while (left < right) {
            int mid = (left + right + 1) >>> 1;
            if (check(s, p, removable, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private boolean check(String s, String p, int[] removable, int mid) {
        Set<Integer> ids = new HashSet<>();
        for (int k = 0; k < mid; k++) {
            ids.add(removable[k]);
        }
        
        // i指向s头结点，j指向p头结点，双指针同时前进
        int i=0, j=0, m = s.length(), n = p.length();
        while (i < m && j < n) {
            if (!ids.contains(i) && s.charAt(i) == p.charAt(j)) {
                j++;
            }
            i++;
        } 
        // j指针走到p尾节点
        return j == n;
    }
}
// @lc code=end

