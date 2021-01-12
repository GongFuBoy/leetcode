package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.ListNode;

public class Offer24 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        return reverseFunction(head, null);
    }

    private ListNode reverseFunction(ListNode cur, ListNode pre) {
        if (cur == null) {
            return pre;
        }
        ListNode result = reverseFunction(cur.next, cur);
        cur.next = pre;
        return result;
    }

}
