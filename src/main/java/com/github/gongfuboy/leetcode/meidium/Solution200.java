package com.github.gongfuboy.leetcode.meidium;

public class Solution200 {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        if (grid[0] == null || grid[0].length == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    dfs(grid, i, j);
                }
            }
        }

        return result;
    }

    /**
     * 深度优先遍历
     * @param grid
     * @param left
     * @param right
     */
    private void dfs(char[][] grid, int left, int right) {
        // 判断是否还在制定区域内
        if (!isInArea(grid, left, right)) {
            return;
        }
        if (grid[left][right] == '0') {
            return;
        }
        if (grid[left][right] == '2') {
            return;
        }

        grid[left][right] = '2';

        dfs(grid, left, right + 1);
        dfs(grid, left, right - 1);
        dfs(grid, left + 1, right);
        dfs(grid, left - 1, right);
    }

    private boolean isInArea(char[][] grid, int left, int right) {
        return left >= 0 && left < grid.length && right >= 0 && right < grid[0].length;
    }

}
