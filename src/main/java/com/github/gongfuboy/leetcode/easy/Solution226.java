package com.github.gongfuboy.leetcode.easy;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

public class Solution226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

}
