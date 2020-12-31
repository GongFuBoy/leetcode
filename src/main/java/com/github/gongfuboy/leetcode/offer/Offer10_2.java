package com.github.gongfuboy.leetcode.offer;

public class Offer10_2 {

    public int numWays(int n) {
        int[] ints = new int[101];

        ints[0] = 1;
        ints[1] = 1;
        ints[2] = 2;

        return numWayLoop(ints, n);
    }

    private int numWayLoop(int[] resultArr, int n) {

        if (resultArr[n] != 0) {
            return resultArr[n];
        }

        return resultArr[n] = (numWayLoop(resultArr, n - 1) + numWayLoop(resultArr, n - 2)) % 1000000007;

    }



}
