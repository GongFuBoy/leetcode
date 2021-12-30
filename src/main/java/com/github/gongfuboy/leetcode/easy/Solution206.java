package com.github.gongfuboy.leetcode.easy;

import com.github.gongfuboy.leetcode.offer.bean.ListNode;

import java.util.LinkedList;

public class Solution206 {

    public ListNode reverseList(ListNode head) {
        LinkedList<ListNode> listNodes = new LinkedList<>();
        while (head != null) {
            listNodes.addFirst(head);
            head = head.next;
        }

        ListNode tempResult = new ListNode(-1);
        ListNode temp = tempResult;
        while (!listNodes.isEmpty()) {
            temp.next = listNodes.pollFirst();
            temp = temp.next;
        }
        temp.next = null;

        return tempResult.next;
    }

}
