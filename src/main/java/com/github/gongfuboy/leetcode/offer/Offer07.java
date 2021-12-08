package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

import java.util.HashMap;


public class Offer07 {

    HashMap<Integer, Integer> treeHashMapNodeAndIndex = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            treeHashMapNodeAndIndex.put(inorder[i], i);
        }
        return buildMyTree(preorder, inorder,
                0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode buildMyTree(int[] preorder, int[] inorder, int preorderLeft,
                                int preorderRight, int inorderLeft, int inorderRight) {
        // 终止条件
        if (preorderLeft > preorderRight) {
            return null;
        }
        // 根节点
        int treeRootPreorderIndex = preorderLeft;
        Integer treeRootInorderIndex = treeHashMapNodeAndIndex.get(preorder[treeRootPreorderIndex]);
        TreeNode rootNode = new TreeNode(preorder[treeRootPreorderIndex]);
        int leftTreeSize = treeRootInorderIndex - inorderLeft;
        rootNode.left = buildMyTree(preorder, inorder, preorderLeft + 1, preorderLeft + 1 + leftTreeSize - 1,
                inorderLeft, treeRootPreorderIndex - 1);
        rootNode.right = buildMyTree(preorder, inorder, preorderLeft + 1 + leftTreeSize, preorderRight,
                treeRootInorderIndex + 1, inorderRight);
        return rootNode;
    }

}
