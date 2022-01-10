package com.github.gongfuboy.leetcode.meidium;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

import java.util.HashMap;

public class Solution377 {

    HashMap<TreeNode, Integer> f = new HashMap<>();
    HashMap<TreeNode, Integer> g = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) {
            return -1;
        }
        dfs(root);
        return Math.max(f.getOrDefault(root, 0), g.getOrDefault(root, 0));
    }


    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        dfs(root.right);

        f.put(root, g.getOrDefault(root.left, 0) + g.getOrDefault(root.right, 0) + root.val);
        g.put(root, Math.max(f.getOrDefault(root.left, 0), g.getOrDefault(root.left, 0)) +
                Math.max(f.getOrDefault(root.right, 0), g.getOrDefault(root.right, 0)));

    }

}
