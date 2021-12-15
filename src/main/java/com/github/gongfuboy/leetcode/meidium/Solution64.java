package com.github.gongfuboy.leetcode.meidium;

public class Solution64 {

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int rows = grid.length;
        int length = grid[0].length;

        int[][] resultDP = new int[rows][length];
        resultDP[0][0] = grid[0][0];

        for (int i = 1; i < rows; i++) {
            resultDP[i][0] = resultDP[i - 1][0] + grid[i][0];
        }

        for (int j = 1; j < length; j++) {
            resultDP[0][j] = resultDP[0][j - 1] + grid[0][j];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < length; j++) {
                resultDP[i][j] = Math.min(resultDP[i - 1][j], resultDP[i][j - 1]) + grid[i][j];
            }
        }

        return resultDP[rows - 1][length - 1];

    }

}
