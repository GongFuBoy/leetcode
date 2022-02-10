package com.github.gongfuboy.leetcode.offer;

public class Offer63 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            int curProfit = prices[i] - minPrice;
            maxProfit = Math.max(curProfit, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Offer63 offer63 = new Offer63();
        System.out.println(offer63.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

}
