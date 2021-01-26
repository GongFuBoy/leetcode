package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.ListNode;

public class Offer52 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int lengthA = lengthListNode(headA);
        int lengthB = lengthListNode(headB);

        while (lengthA != lengthB) {
            if (lengthA > lengthB) {
                lengthA--;
                headA = headA.next;
            } else {
                lengthB--;
                headB = headB.next;
            }
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int lengthListNode(ListNode node) {
        int result = 0;
        while (node != null) {
            result++;
            node = node.next;
        }

        return result;
    }

}
