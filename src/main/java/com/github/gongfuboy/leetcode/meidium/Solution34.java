package com.github.gongfuboy.leetcode.meidium;

import java.util.Arrays;

/**
 * Created by GongFuBoy on 2020/5/9.
 *
 * 在排序数组中查找元素的第一个和最后一个位置
 *
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 *
 *
 */
public class Solution34 {

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums == null) return result;
//        if (nums.length < 2) return result;

        int leftIndex = getIndex(nums, target, true);
        if (leftIndex >= nums.length || nums[leftIndex] != target) {
            return result;
        }

        int rightIndex = getIndex(nums, target, false);

        result[0] = leftIndex;
        result[1] = rightIndex - 1;
        return result;
    }

    private int getIndex(int[] nums, int target, boolean leftFlag) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = (left + right) / 2;
            if (target < nums[middle] || (leftFlag && nums[middle] == target)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        System.out.println(Arrays.toString(solution34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }


}
