package com.github.gongfuboy.leetcode.offer;

public class Offer42 {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + Math.max(nums[i - 1], 0);
            result = Math.max(nums[i], result);
        }
        return result;
    }

}
