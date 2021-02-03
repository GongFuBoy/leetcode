package com.github.gongfuboy.leetcode.offer;

public class Offer57 {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 1) {
            return null;
        }
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                return new int[]{nums[left], nums[right]};
            }
        }
        return null;
    }

}
