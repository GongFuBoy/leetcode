package com.github.gongfuboy.leetcode.offer;

public class Offer59_1 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int resultArrLength = nums.length - k + 1;
        int[] result = new int[resultArrLength];

        for (int i = 0; i < resultArrLength; i++) {
            int firstWindowMaxNum = findWindowMaxNum(nums, i, i + k);
            result[i] = firstWindowMaxNum;
        }
        return result;
    }

    private int findWindowMaxNum(int[] nums, int start, int end) {
        int maxNum = nums[start];
        for (int i = start + 1; i < end; i++) {
            maxNum = Math.max(maxNum, nums[i]);
        }
        return maxNum;
    }

}
