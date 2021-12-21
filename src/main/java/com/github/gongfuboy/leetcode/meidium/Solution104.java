package com.github.gongfuboy.leetcode.meidium;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

public class Solution104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            TreeNode left = root.left;
            TreeNode right = root.right;
            return Math.max(maxDepth(left), maxDepth(right)) + 1;
        }
    }

}
