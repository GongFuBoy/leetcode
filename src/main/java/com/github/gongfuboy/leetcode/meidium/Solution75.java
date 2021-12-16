package com.github.gongfuboy.leetcode.meidium;

public class Solution75 {

    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int temp = -1;
        int head = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp = nums[head];
                nums[head] = nums[i];
                nums[i] = temp;
                head++;
            }
        }

        for (int i = head; i < nums.length; i++) {

            if (nums[i] == 1) {
                temp = nums[head];
                nums[head] = nums[i];
                nums[i] = temp;
                head++;
            }
        }

    }

}
