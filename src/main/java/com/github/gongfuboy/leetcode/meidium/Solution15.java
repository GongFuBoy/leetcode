package com.github.gongfuboy.leetcode.meidium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by GongFuBoy on 2020/4/25.
 *
 * 三数之和
 *
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *  
 *
 * 示例：
 *
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 *
 */
public class Solution15 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return result;
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int resultNum = nums[i] + nums[left] + nums[right];
                if (resultNum == 0) {
                    result.add(Stream.of(nums[i], nums[left], nums[right]).collect(Collectors.toList()));
                    left++;

                    // 判断left++ 后与之前的值进行比较, 不能相等
                    while (left < nums.length && nums[left - 1] == nums[left]) {
                        left++;
                    }

                    right--;
                    // 判断right-- 后与之前的值进行比较, 不能相等
                    while (right > 0 && nums[right + 1] == nums[right]) {
                        right--;
                    }

                } else if (resultNum > 0) {
                    right--;
                    // 判断right-- 后与之前的值进行比较, 不能相等
                    while (right > 0 && nums[right + 1] == nums[right]) {
                        right--;
                    }
                } else {
                    left++;
                    // 判断left++ 后与之前的值进行比较, 不能相等
                    while (left < nums.length && nums[left - 1] == nums[left]) {
                        left++;
                    }
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        int[] ints = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution15.threeSum(ints));
    }

}
