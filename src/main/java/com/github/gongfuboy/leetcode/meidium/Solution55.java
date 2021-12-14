package com.github.gongfuboy.leetcode.meidium;

public class Solution55 {

    public boolean canJump(int[] nums) {
        int length = nums.length;
        int mostStep = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i <= mostStep) {
                mostStep = Math.max(mostStep, i + nums[i]);
                if (mostStep >= length - 1) {
                    return true;
                }
            }
        }
        return false;

    }

}
