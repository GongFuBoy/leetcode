package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.ListNode;

public class Offer25 {


    public static void main(String[] args) {
        ListNode one0 = new ListNode(1);
        ListNode one1 = new ListNode(2);
        ListNode one2 = new ListNode(3);
        one0.next = one1;
        one1.next = one2;

        ListNode two0 = new ListNode(1);
        ListNode two1 = new ListNode(3);
        ListNode two2 = new ListNode(4);
        two0.next = two1;
        two1.next = two2;

        Offer25 offer25 = new Offer25();
        offer25.mergeTwoLists(one0, two0);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tempHead = new ListNode(-1);

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode cur = tempHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 != null ? l1 : l2;
        return tempHead.next;
    }

}
