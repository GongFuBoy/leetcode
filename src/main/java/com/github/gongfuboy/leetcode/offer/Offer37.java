package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

import java.util.LinkedList;

public class Offer37 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        result.append("[");
        treeNodes.addFirst(root);
        while (!treeNodes.isEmpty()) {
            TreeNode node = treeNodes.pollLast();
            if (node != null) {
                result.append(node.val).append(",");
                treeNodes.addFirst(node.left);
                treeNodes.addFirst(node.right);
            } else {
                result.append("null,");
            }
        }
        return result.substring(0, result.length() - 1) + "]";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.equals("[]")) {
            return null;
        }
        String tempString = data.replace("[", "");
        String[] nodeValues = tempString.replace("]", "").split(",");
        String rootValue = nodeValues[0];
        TreeNode root = new TreeNode(Integer.parseInt(rootValue));
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.addFirst(root);
        int index = 1;
        while (!treeNodes.isEmpty()) {
            TreeNode temp = treeNodes.pollLast();
            String leftNodeValue = nodeValues[index];
            if (!leftNodeValue.equals("null")) {
                TreeNode leftNode = new TreeNode(Integer.parseInt(leftNodeValue));
                temp.left = leftNode;
                treeNodes.addFirst(leftNode);
            }
            index++;
            String rightNodeValue = nodeValues[index];
            if (!rightNodeValue.equals("null")) {
                TreeNode rightNode = new TreeNode(Integer.parseInt(rightNodeValue));
                temp.right = rightNode;
                treeNodes.addFirst(rightNode);
            }
            index++;
        }
        return root;
    }

}
