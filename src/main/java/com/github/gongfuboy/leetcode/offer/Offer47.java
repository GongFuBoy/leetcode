package com.github.gongfuboy.leetcode.offer;

import java.util.Arrays;

public class Offer47 {

    public int maxValue(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return -1;
        }
        int[][] result = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 && j == 0) {
                    result[i][j] = grid[i][j];
                } else if (i == 0) {
                    result[i][j] = result[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    result[i][j] = result[i - 1][j] + grid[i][j];
                } else {
                    result[i][j] = Math.max(result[i - 1][j], result[i][j - 1]) + grid[i][j];
                }
            }
        }
        return result[grid.length - 1][grid[0].length - 1];
    }

}
