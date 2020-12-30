package com.github.gongfuboy.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

public class Offer06 {

    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> integers = new ArrayList<>();
        addNodeToList(integers, head);
        int[] result = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            result[i] = integers.get(i);
        }
        return result;
    }

    private void addNodeToList(List<Integer> result, ListNode head) {
        if (head == null) return;
        addNodeToList(result, head.next);
        result.add(head.val);
    }

    private static final class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }

    }

}
