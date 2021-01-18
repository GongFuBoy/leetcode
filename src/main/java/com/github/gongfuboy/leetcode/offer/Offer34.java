package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer34 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return new ArrayList<>();
        }
        LinkedList<List<Integer>> lists = new LinkedList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        cur(lists, temp, root, sum);
        return lists;
    }

    private void cur(LinkedList<List<Integer>> lists, LinkedList<Integer> temp, TreeNode root, int sum) {
        if(root == null) return;
        temp.add(root.val);
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            lists.add(new LinkedList<>(temp));
        }
        cur(lists, temp, root.left, sum);
        cur(lists, temp, root.right, sum);
        temp.removeLast();
    }


}
