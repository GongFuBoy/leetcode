package com.github.gongfuboy.leetcode.offer;

public class Offer21 {

    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 1) {
            return nums;
        }
        int left = 0;
        int right = nums.length - 1;
        int temp = 0;
        while (left < right) {
            if (nums[left] % 2 == 1) {
                left++;
                continue;
            }
            if (nums[right] % 2 == 0) {
                right--;
                continue;
            }
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }

}
