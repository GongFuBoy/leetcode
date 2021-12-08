package com.github.gongfuboy.leetcode.offer;


import com.github.gongfuboy.leetcode.offer.bean.RandomNode;

import java.util.HashMap;

public class Offer35 {

    public RandomNode copyRandomList(RandomNode head) {
        if (head == null) {
            return null;
        }
        HashMap<RandomNode, RandomNode> nodeMap = new HashMap<>();
        RandomNode cur = head;

        while (cur != null) {
            nodeMap.put(cur, new RandomNode(cur.val));
            cur = cur.next;
        }

        cur = head;

        while (cur != null) {
            RandomNode randomNode = nodeMap.get(cur);
            randomNode.next = nodeMap.get(cur.next);
            randomNode.random = nodeMap.get(cur.random);
            cur = cur.next;
        }
        return nodeMap.get(head);
    }

}
