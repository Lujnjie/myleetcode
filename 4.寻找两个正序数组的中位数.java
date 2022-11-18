/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m+n];
        int mStart = 0;
        int nStart = 0;

        for(int i=0; i < m+n; i++) {
            if(mStart >= m) {
                nums[i] = nums2[nStart++];
                continue;
            }
            if(nStart >= n) {
                nums[i] = nums1[mStart++];
                continue;
            }

            if(nums1[mStart] < nums2[nStart]) {
                nums[i] = nums1[mStart++];
            } else {
                nums[i] = nums2[nStart++];
            }
        }

        int left = (n+m+1) / 2;
        int right = (n+m+2) / 2;

        return (nums[left-1] + nums[right-1])/2D;
    }

	// public static void main(String[] args) {
    //     Integer a = 112;
    //     // a & 1 == 0 偶数
    //     System.out.println((a & 1) == 0);
        
    //     Solution11 s = new Solution11();
    //     s.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
	// }
}
// @lc code=end

