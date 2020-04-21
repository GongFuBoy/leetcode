package com.github.gongfuboy.leetcode.meidium;

/**
 * 两数相加
 *
 * Created by GongFuBoy on 2020/4/21.
 */
public class Solution2 {


    public static void main(String[] args) {
        ListNode firstNode1 = new ListNode(2);
        ListNode firstNode2 = new ListNode(4);
        ListNode firstNode3 = new ListNode(3);
        firstNode1.next = firstNode2;
        firstNode2.next = firstNode3;

        ListNode secondNode1 = new ListNode(5);
        ListNode secondNode2 = new ListNode(6);
        ListNode secondNode3 = new ListNode(4);
        secondNode1.next = secondNode2;
        secondNode2.next = secondNode3;

        addTwoNumbers(firstNode1, secondNode1);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int stepVal = 0;
        ListNode concurrenNode = null;
        // 构造第一个节点
        int l1Val = l1 == null ? 0 : l1.val;
        int l2Val = l2 == null ? 0 : l2.val;

        int oneVal = l1Val + l2Val + stepVal;
        if (oneVal >= 10) {
            stepVal = 1;
            oneVal = oneVal - 10;
        } else {
            stepVal = 0;
        }
        ListNode listNode = new ListNode(oneVal);
        concurrenNode = listNode;

        // 构造第二个节点
        while (l1.next != null || l2.next != null) {
            int nextL1Val = l1.next == null ? 0 : l1.next.val;
            int nextL2Val = l2.next == null ? 0 : l2.next.val;

            oneVal = nextL1Val + nextL2Val + stepVal;
            if (oneVal >= 10) {
                stepVal = 1;
                oneVal = oneVal - 10;
            } else {
                stepVal = 0;
            }

            ListNode nextListNode = new ListNode(oneVal);
            concurrenNode.next = nextListNode;
            concurrenNode = nextListNode;

            if (l1.next != null) l1 = l1.next;
            if (l2.next != null) l2 = l2.next;
        }

        if (stepVal > 0) {
            concurrenNode.next = new ListNode(stepVal);
        }
        return listNode;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
