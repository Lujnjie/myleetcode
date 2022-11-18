/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


// class SolutionTest {
//     public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         // ListNode aCurr = headA;
//         // ListNode bCurr = headB;
        
//         // ListNode begiNode = aCurr;
//         // while(aCurr != null && bCurr != null) {
//         //     ListNode tmpA = aCurr;
//         //     while(bCurr != null) {
//         //         if(aCurr.val == bCurr.val) {
//         //             aCurr = aCurr.next;
//         //             bCurr = bCurr.next;
//         //         } else {
//         //             bCurr = bCurr.next;
//         //             begiNode = bCurr;
//         //         }
//         //     }
//         //     if(aCurr == null) {
//         //         return begiNode;
//         //     }

//         //     aCurr = tmpA.next;
//         //     begiNode = aCurr;
//         //     bCurr = headB;
//         // }
//         // return null;

//         if(headA == null || headB == null) return null;
//         ListNode pA = headA, pB = headB;
//         // 在这里第一轮体现在pA和pB第一次到达尾部会移向另一链表的表头, 而第二轮体现在如果pA或pB相交就返回交点, 不相交最后就是null==null
//         while(pA != pB) {
//             pA = pA == null ? headB : pA.next;
//             pB = pB == null ? headA : pB.next;
//         }
//         return pA;
//     }
//     public static void main(String[] args) {
//         ListNode l1 = new ListNode(4, new ListNode(1));
//         ListNode l2 = new ListNode(5);
//         ListNode s = getIntersectionNode(l1, l2);
//         System.out.println();
//     }
// }
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
//     ListNode(int x, ListNode n) {
//         val = x;
//         next = n;
//     }
// }
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while(pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }

        return pA;
    }
}
// @lc code=end

