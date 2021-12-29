package com.github.gongfuboy.leetcode.meidium;

public class Solution198 {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int f0 = nums[0];
        int f1 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int fi = f0 + nums[i];
            int temp = f1;
            f1 = Math.max(fi, f1);
            f0 = temp;
        }

        return f1;

    }

}
