package com.github.gongfuboy.leetcode.offer;

import sun.nio.cs.ArrayEncoder;

public class Offer13 {

    private boolean[][] visited;


    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        return dfs(0, 0, m, n, k);
    }

    private int sum(int target) {
        int result = 0;
        while (target != 0) {
            result += target % 10;
            target = target / 10;
        }
        return result;
    }



    private int dfs(int x, int y, int m, int n, int k) {
        if (x >= m || y >= n || visited[x][y] || sum(x) + sum(y) > k) {
            return 0;
        }
        visited[x][y] = true;
        return 1 + dfs(x + 1, y, m, n, k) + dfs(x, y + 1, m, n, k);
    }

}
