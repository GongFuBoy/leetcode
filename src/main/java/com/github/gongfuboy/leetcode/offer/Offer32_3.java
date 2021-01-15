package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer32_3 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<List<Integer>> result = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            LinkedList<Integer> tempList = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode tempNode = queue.poll();
                if (result.size() % 2 == 0) {
                    tempList.addLast(tempNode.val);
                } else {
                    tempList.addFirst(tempNode.val);
                }
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
            result.add(tempList);
        }

        return result;
    }

}
