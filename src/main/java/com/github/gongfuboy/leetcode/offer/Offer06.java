package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Offer06 {

    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }

        Stack<ListNode> listNodes = new Stack<>();
        while (head != null) {
            listNodes.add(head);
            head = head.next;
        }

        int[] result = new int[listNodes.size()];
        int index = 0;
        while (!listNodes.isEmpty()) {
            result[index] = listNodes.pop().val;
            index++;
        }
        return result;

    }



}
