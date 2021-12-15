package com.github.gongfuboy.leetcode.easy;

public class Solution70 {

    public int climbStairs(int n) {
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 2] + result[i - 1];
        }

        return result[n];
    }

}
