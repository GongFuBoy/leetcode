package com.github.gongfuboy.leetcode.meidium;

public class Solution62 {

    public int uniquePaths(int m, int n) {
        int[][] ints = new int[m][n];

        for (int i = 0; i < m; i++) {
            ints[i][0] = 1;
        }

        for (int j = 0; j < n; j++) {
            ints[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                ints[i][j] = ints[i][j - 1] + ints[i - 1][j];
            }
        }

        return ints[m - 1][n - 1];


    }

}
