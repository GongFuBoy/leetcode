package com.github.gongfuboy.leetcode.meidium;

public class Solution121 {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        long maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return (int) maxProfit;
    }

}
