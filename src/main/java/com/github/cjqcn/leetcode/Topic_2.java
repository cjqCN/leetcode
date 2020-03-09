package com.github.cjqcn.leetcode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
     * 解题思路：
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
