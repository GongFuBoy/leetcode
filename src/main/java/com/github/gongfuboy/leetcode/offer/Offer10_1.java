package com.github.gongfuboy.leetcode.offer;

public class Offer10_1 {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        int[] resultArr = new int[n + 1];
        resultArr[0] = 0;
        resultArr[1] = 1;

        for (int i = 2; i <= n; i++) {
            resultArr[i] = resultArr[i - 1] + resultArr[i - 2];
            resultArr[i] = resultArr[i] % 1000000007;
        }
        return resultArr[n];
    }


}
