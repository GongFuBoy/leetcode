package com.github.gongfuboy.leetcode.meidium;

/**
 * Created by GongFuBoy on 2020/4/27.
 *
 * 两两交换链表中的节点
 *
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 */
public class Solution24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode fisrtNode = head;
        ListNode secondNode = head.next;

        fisrtNode.next = swapPairs(secondNode.next);
        secondNode.next = fisrtNode;

        return secondNode;

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        Solution24 solution24 = new Solution24();
        System.out.println(solution24.swapPairs(listNode1));
    }

}
