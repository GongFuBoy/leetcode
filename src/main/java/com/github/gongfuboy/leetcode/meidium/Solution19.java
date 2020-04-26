package com.github.gongfuboy.leetcode.meidium;

/**
 * Created by GongFuBoy on 2020/4/26.
 * <p>
 * 删除链表的倒数第N个节点
 * <p>
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int fastIndex = 0;
        if (head.next == null) {
            return null;
        }


        ListNode tempNode = new ListNode(0);
        tempNode.next = head;
        ListNode fastNode = tempNode;
        ListNode slowNode = tempNode;
        while (fastNode.next != null) {
            fastNode = fastNode.next;
            fastIndex++;
            if (fastIndex > n) {
                slowNode = slowNode.next;
            }

        }
        slowNode.next = slowNode.next.next;
        return tempNode.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }


    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        ListNode oneListNode = new ListNode(1);
        ListNode twoListNode = new ListNode(2);
        oneListNode.next = twoListNode;
        System.out.println(solution19.removeNthFromEnd(oneListNode, 2));
    }

}
