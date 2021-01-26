package com.github.gongfuboy.leetcode.offer;

public class Offer49 {

    public int nthUglyNumber(int n) {
        int[] allResult = new int[n];
        allResult[0] = 1;
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 1; i < allResult.length; i++) {
            int uglyANum = 2 * allResult[a];
            int uglyBNum = 3 * allResult[b];
            int uglyCNum = 5 * allResult[c];
            allResult[i] = Math.min(Math.min(uglyANum, uglyBNum), uglyCNum);
            if (allResult[i] == uglyANum) {
                a++;
            }
            if (allResult[i] == uglyBNum) {
                b++;
            }
            if (allResult[i] == uglyCNum) {
                c++;
            }
        }
        return allResult[n - 1];
    }

}
