package com.github.gongfuboy.leetcode.offer;

public class Offer04 {

    private boolean[][] flagMatrix;

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // 使用dfs进行遍历
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        flagMatrix = new boolean[matrix.length][matrix[0].length];
        return dfs(matrix, target, 0, 0);
    }

    private boolean dfs(int[][] matrix, int target, int left, int right) {
        // 判断是否被访问过
        if (left >= matrix.length || right >= matrix[0].length) {
            return false;
        }
        if (flagMatrix[left][right]) {
            return false;
        }
        flagMatrix[left][right] = true;
        if (matrix[left][right] == target) {
            return true;
        }
        return dfs(matrix, target, left + 1, right) || dfs(matrix, target, left, right + 1);
    }


}
