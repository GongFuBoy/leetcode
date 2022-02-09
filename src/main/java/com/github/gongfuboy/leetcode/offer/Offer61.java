package com.github.gongfuboy.leetcode.offer;

import java.util.HashSet;

public class Offer61 {

    public boolean isStraight(int[] nums) {
        if (nums == null || nums.length != 5) {
            return false;
        }

        HashSet<Integer> distinctSet = new HashSet<>();

        int minNum = 14;
        int maxNum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (distinctSet.contains(nums[i])) {
                return false;
            }
            distinctSet.add(nums[i]);
            minNum = Math.min(minNum, nums[i]);
            maxNum = Math.max(maxNum, nums[i]);
        }
        return maxNum - minNum < 5;

    }

    public static void main(String[] args) {
        Offer61 offer61 = new Offer61();
        System.out.println(offer61.isStraight(new int[]{1, 2, 3, 4, 5}));
    }


}
