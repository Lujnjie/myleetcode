/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode addTwoNumbers(ListNode q, ListNode p) {
        ListNode res = new ListNode();
        int t1 = 0; // 标识进位值
        ListNode t = res;

        while(q != null || p != null) {

            int sum = (q == null ? 0 : q.val) + (p == null ? 0 : p.val) + t1;
            t1 = sum / 10;
            sum = sum % 10;

            ListNode s = new ListNode(sum);
            t.next = s;
            t = t.next;
            if(q != null) {
                q = q.next;
            }
            if(p != null) {
                p = p.next;
            }
        }
        if(t1 != 0) {
            t.next = new ListNode(t1);
        }
        return res.next;
    }
    // public static void main(String[] args) {
    //     ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
    //     ListNode l2 = new ListNode(1, new ListNode(8, new ListNode(3)));
    //     ListNode res = addTwoNumbers(l1, l2);
    //     System.out.println(13);
    // }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
// @lc code=end

