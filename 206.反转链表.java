/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution123 {
    public ListNode reverseList(ListNode head) {
        // ListNode prev = null;
        // ListNode curr = head;
        // while(curr != null) {
        //     ListNode tmp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = tmp;
        // }
        // return prev;
        if(head == null || head.next == null) {
            return head;
        }

        ListNode node = reverseList(head.next);
        head.next.next = node;
        head.next = null;
        return node;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(55);
        head.next.next.next = new ListNode(50);

        Solution123 solution123 = new Solution123();
        head = solution123.reverseList(head);
        System.out.println(123);
    }
}

// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
// }

// @lc code=start
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}

// @lc code=end

