package com.github.gongfuboy.leetcode.easy;

public class Solution52 {

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int result = nums[0];

        for (int num : nums) {
            pre = Math.max(pre + num, num);
            result = Math.max(result, pre);
        }

        return result;

    }

}
