package com.github.gongfuboy.leetcode.easy;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }

}
