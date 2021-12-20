package com.github.gongfuboy.leetcode.meidium;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

public class Solution101 {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }
        return root1.val == root2.val && check(root1.left, root2.right) && check(root1.right, root2.left);
    }

}
