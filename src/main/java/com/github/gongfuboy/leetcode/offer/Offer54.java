package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

public class Offer54 {

    private TreeNode result;
    private int k;

    public int kthLargest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }

        this.k = k;
        dfs(root);
        return result.val;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        if (k == 0) return;
        if (--k == 0) result = root;
        dfs(root.left);

    }


}
