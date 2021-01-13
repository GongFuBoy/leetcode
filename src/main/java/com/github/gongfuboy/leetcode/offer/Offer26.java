package com.github.gongfuboy.leetcode.offer;

import com.github.gongfuboy.leetcode.offer.bean.TreeNode;

public class Offer26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {

        if (A == null || B == null) {
            return false;
        }

        return isEquals(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isEquals(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null || A.val != B.val) {
            return false;
        }
        return isEquals(A.left, B.left) && isEquals(A.right, B.right);
    }

}
