package com.github.gongfuboy.leetcode.meidium;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

import java.util.HashMap;

public class Offer105 {

    HashMap<Integer, Integer> valueAndIndex = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        for (int i = 0; i < inorder.length; i++) {
            valueAndIndex.put(inorder[i], i);
        }
        return buildMyTree(preorder, inorder, 0, length - 1, 0, length - 1);
    }

    private TreeNode buildMyTree(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }
        int rootValue = preorder[preStart];
        TreeNode rootNode = new TreeNode(rootValue);
        Integer inorderRootIndex = valueAndIndex.get(rootValue);
        int leftTreeSize = inorderRootIndex - inStart + 1;
        rootNode.left = buildMyTree(preorder, inorder, preStart + 1, preStart + leftTreeSize - 1, inStart, leftTreeSize - 1);
        rootNode.right = buildMyTree(preorder, inorder, preStart + leftTreeSize, preEnd, inorderRootIndex + 1, inEnd);
        return rootNode;
    }

}
