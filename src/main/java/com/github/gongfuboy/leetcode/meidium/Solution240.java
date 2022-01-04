package com.github.gongfuboy.leetcode.meidium;

public class Solution240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }

        int topIndex = 0;
        int rightIndex = matrix[0].length - 1;

        while (topIndex < matrix.length && rightIndex >= 0) {
            int rightTopValue = matrix[topIndex][rightIndex];
            if (rightTopValue > target) {
                rightIndex--;
            } else if (rightTopValue < target) {
                topIndex++;
            } else {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Solution240 solution240 = new Solution240();
        int[][] arr = new int[][]{{-5}};
        int target = -5;
        solution240.searchMatrix(arr, target);
    }

}
