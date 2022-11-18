import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个升序链表
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


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        for (ListNode listNode : lists) {
            head = mergeTwoList(head, listNode);
        }

        return head;
    }

    public ListNode mergeTwoList(ListNode a, ListNode b) {
        if(a == null) {
            return b;
        }
        if(b == null) {
            return a;
        }
        ListNode head = new ListNode(0);
        ListNode p = head;
        ListNode q = a;
        ListNode v = b;

        while(q != null && v != null) {
            if(q.val <= v.val) {
                p.next = q;
                q = q.next;
            } else {
                p.next = v;
                v = v.next;    
            }
            p = p.next;
        }

        p.next = q != null ? q : v;
        
        return head.next;
    }

}
// @lc code=end

class Solution2 {
    public ListNode mergeKLists(ListNode[] lists) {
         if (lists.length == 0) {
            return null;
        }
        // 优先队列
        Queue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val > o2.val ? 1 : -1;
            }
        });

        for (ListNode listNode : lists) {
            if(listNode != null)
                queue.offer(listNode);
        }

        ListNode ans = new ListNode(0);
        ListNode tail = ans;

        while(!queue.isEmpty()) {
            ListNode node = queue.poll();
            tail.next = node;
            tail = tail.next;
    
            if(node.next != null)
                queue.offer(node.next);
        }

        return ans.next;
    }

}
// @lc code=end


