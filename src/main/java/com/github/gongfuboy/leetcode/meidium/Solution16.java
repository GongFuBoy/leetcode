package com.github.gongfuboy.leetcode.meidium;

import java.util.Arrays;

/**
 * 最接近的三数之和
 *
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
 * 使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 */
public class Solution16 {

    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return -1;
        }

        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                int step = sum > target ? sum - target : target - sum;
                if (step == 0) return target;
                int realStep = result > target ? result - target : target - result;
                result = step > realStep ? result : sum;
                if (sum - target < 0) {
                    left++;
                    while (left < nums.length && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else {
                    right--;
                    while (right > 0 && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        System.out.println(solution16.threeSumClosest(new int[]{1,2,4,8,16,32,64,128}, 82));
    }

}
