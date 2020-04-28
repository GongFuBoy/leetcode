package com.github.gongfuboy.leetcode.easy;

import com.github.gongfuboy.leetcode.meidium.Solution19;

/**
 * 合并两个有序链表
 * <p>
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Solution21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        while (l1 != null && l2 != null) {
            int l1Val = l1.val;
            int l2Val = l2.val;
            if (l1Val > l2Val) {
                head.next = l2;
                l2 = l2.next;
            } else {
                head.next = l1;
                l1 = l1.next;
            }
            head = head.next;
        }
        head.next = l1 == null ? l2 : l1;
        return temp.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        System.out.println(solution21.mergeTwoLists(listNode1, listNode4));


    }

}
