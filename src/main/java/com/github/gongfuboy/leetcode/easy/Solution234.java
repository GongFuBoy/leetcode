package com.github.gongfuboy.leetcode.easy;

import com.github.gongfuboy.leetcode.offer.bean.ListNode;

import java.util.ArrayList;

public class Solution234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        ArrayList<ListNode> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head);
            head = head.next;
        }

        int start = 0;
        int end = arr.size() - 1;
        while (start < end) {
            ListNode startNode = arr.get(start);
            ListNode endNode = arr.get(end);
            if (startNode.val != endNode.val) {
                return false;
            }
            start++;
            end--;
        }

        return true;

    }

}
