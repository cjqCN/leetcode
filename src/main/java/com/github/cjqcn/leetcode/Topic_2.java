package com.github.cjqcn.leetcode;

public class Topic_2 {


    //  Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }
            boolean tag = false;
            ListNode res, next;
            res = next = new ListNode(0);
            while (!(l1 == null || l2 == null)) {
                next.next = new ListNode(0);
                next = next.next;
                int num = l1.val + l2.val;
                if (tag) {
                    num++;
                    tag = false;
                }
                next.val = num % 10;
                tag = (num / 10 == 1);
                l1 = l1.next;
                l2 = l2.next;
            }
            ListNode ls = l1 != null ? l1 : l2;
            if (ls != null) {
                next.next = ls;
            }
            while (tag) {
                if (next.next == null) {
                    next.next = new ListNode(0);
                }
                next = next.next;
                int num = next.val;
                next.val = (++num) % 10;
                tag = (num / 10 == 1);
            }
            return res.next;
        }
    }
}
