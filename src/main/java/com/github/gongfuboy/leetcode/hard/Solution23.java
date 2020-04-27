package com.github.gongfuboy.leetcode.hard;

/**
 * Created by GongFuBoy on 2020/4/27.
 */
public class Solution23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        if (lists.length < 2) return lists[0];
        ListNode temp = new ListNode(-1);
        for (int i = 0; i < lists.length - 1; i++) {
            ListNode listNode = mergeTwoListNode(lists[i], lists[i + 1], temp);
            lists[i + 1] = listNode;
        }
        return temp.next;
    }

    private ListNode mergeTwoListNode(ListNode l1, ListNode l2, ListNode prehead) {
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
