package com.github.gongfuboy.leetcode.meidium;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        LinkedList<TreeNode> temp = new LinkedList<>();
        temp.addFirst(root);
        while (!temp.isEmpty()) {
            List<Integer> oneLevel = new ArrayList<>();
            int size = temp.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = temp.pollLast();
                oneLevel.add(node.val);
                if (node.left != null) {
                    temp.addFirst(node.left);
                }
                if (node.right != null) {
                    temp.addFirst(node.right);
                }
            }
            result.add(oneLevel);
        }

        return result;

    }

}
