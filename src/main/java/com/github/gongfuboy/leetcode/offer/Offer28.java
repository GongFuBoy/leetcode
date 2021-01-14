package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

public class Offer28 {

    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : cur(root.left, root.right);
    }

    private boolean cur(TreeNode L, TreeNode R) {
        if (L == null && R == null) {
            return true;
        }
        if (L == null || R == null || L.val != R.val) {
            return false;
        }
        return cur(L.left, R.right) && cur(L.right, R.left);
    }



}
