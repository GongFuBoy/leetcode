package com.github.gongfuboy.leetcode.offer;

public class Offer14_1 {

    public int cuttingRope(int n) {
        int[] result = new int[n + 1];
        result[2] = 1;
        return function(result, n);
    }

    private int function(int[] result, int n) {
        if (result[n] != 0) {
            return result[n];
        }

        int maxNum = 0;
        for (int i = 2; i < n; i++) {
            maxNum = Math.max(maxNum, Math.max(i * function(result, n - i), i * (n - i)));
        }

        result[n] = maxNum;
        return result[n];

    }

}
