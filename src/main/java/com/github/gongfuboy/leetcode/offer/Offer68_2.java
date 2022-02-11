package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

import java.util.HashMap;
import java.util.HashSet;

public class Offer68_2 {

    HashMap<TreeNode, TreeNode> childNodeAndP = new HashMap<>();
    HashSet<TreeNode> distinctSet = new HashSet<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        childNodeAndP.put(root, null);
        dfs(root);
        while (p != null) {
            TreeNode pParentNode = childNodeAndP.get(p);
            distinctSet.add(p);
            p = pParentNode;
        }

        while (q != null) {
            if (distinctSet.contains(q)) {
                return q;
            }
            q = childNodeAndP.get(q);
        }
        return null;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.right != null) {
            childNodeAndP.put(root.right, root);
            dfs(root.right);
        }
        if (root.left != null) {
            childNodeAndP.put(root.left, root);
            dfs(root.left);
        }
    }




}
