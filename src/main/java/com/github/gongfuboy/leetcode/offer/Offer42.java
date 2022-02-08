package com.github.gongfuboy.leetcode.offer;

public class Offer42 {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int[] f = new int[nums.length];

        // 初始状态
        f[0] = nums[0];
        int result = f[0];

        // 状态转移过程
        for (int i = 1; i < nums.length; i++) {
            f[i] = Math.max(f[i - 1] + nums[i], nums[i]);
            result = Math.max(f[i], result);
        }

        return result;

    }

}
