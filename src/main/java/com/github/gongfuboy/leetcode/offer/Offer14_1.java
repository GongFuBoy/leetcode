package com.github.gongfuboy.leetcode.offer;

public class Offer14_1 {

    public int cuttingRope(int n) {
        long[] result = new long[n + 1];
        result[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            for (int j = 2; j < i; j++) {
                result[i] = Math.max(result[i], Math.max(j * (i - j), j * result[i - j]));
            }
        }
        return (int) (result[n] % 1000000007);
    }


}
