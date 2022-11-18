/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBst(0, nums.length - 1, nums);
    }

    public TreeNode toBst(int left, int right, int[] nums) {
        // 答案不唯一，保证左右字数平衡即可
        if(left > right) {
            return null;
        }

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBst(left, mid-1, nums);
        root.right = toBst(mid+1, right, nums);

        return root;
    }
}
// @lc code=end

