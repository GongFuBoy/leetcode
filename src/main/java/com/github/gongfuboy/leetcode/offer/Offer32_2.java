package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer32_2 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<List<Integer>> result = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode tempNode = queue.poll();
                temp.add(tempNode.val);
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
            result.add(temp);
        }
        return result;
    }

}
