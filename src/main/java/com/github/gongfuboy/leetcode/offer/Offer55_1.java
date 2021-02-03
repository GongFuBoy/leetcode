package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

import java.util.LinkedList;

public class Offer55_1 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = 0;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addFirst(root);

        while (!queue.isEmpty()) {
            LinkedList<TreeNode> temp = new LinkedList<>();
            for (TreeNode treeNode : queue) {
                if (treeNode.left != null) {
                    temp.addFirst(treeNode.left);
                }
                if (treeNode.right != null) {
                    temp.addFirst(treeNode.right);
                }
            }
            queue = temp;
            result++;
        }

        return result;
    }

}
