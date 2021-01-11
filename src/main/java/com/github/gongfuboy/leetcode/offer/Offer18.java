package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.ListNode;
import com.sun.crypto.provider.PBEWithMD5AndDESCipher;

import java.util.List;

public class Offer18 {

    public ListNode deleteNode(ListNode head, int val) {
        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode pre = temp;
        ListNode cur = head;

        while (cur != null) {

            if (cur.val == val) {
                pre.next = cur.next;
                break;
            }

            pre = cur;
            cur = cur.next;
        }

        return temp.next;

    }

}
