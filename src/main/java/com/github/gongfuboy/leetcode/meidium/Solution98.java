package com.github.gongfuboy.leetcode.meidium;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

public class Solution98 {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    public boolean isValidBST(TreeNode root, long upper, long lower) {
        if (root == null) {
            return true;
        }

        if (root.val >= upper || root.val <= lower) {
            return false;
        }

        return isValidBST(root.left, root.val, lower) && isValidBST(root.right, upper, root.val);

    }

}
