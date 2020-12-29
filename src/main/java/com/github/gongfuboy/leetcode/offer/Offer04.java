package com.github.gongfuboy.leetcode.offer;

public class Offer04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int lines = matrix[0].length;

        int startRow = 0;
        int startLine = lines - 1;
        while (startRow < rows && startLine > -1) {
            if (matrix[startRow][startLine] == target) {
                return true;
            } else if (matrix[startRow][startLine] > target) {
                startLine--;
            } else {
                startRow++;
            }

        }
        return false;
    }

}
