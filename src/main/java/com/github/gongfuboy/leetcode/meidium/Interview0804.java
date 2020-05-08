package com.github.gongfuboy.leetcode.meidium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GongFuBoy on 2020/5/8.
 *
 * 幂集。
 * 编写一种方法，返回某集合的所有子集。集合中不包含重复的元素。
 *
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 *
 *  输入： nums = [1,2,3]
 *  输出：
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 *
 */
public class Interview0804 {

    public List<List<Integer>> subsets(int[] nums) {

        if (nums == null) {
            return null;
        }

        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        int pow = (int) Math.pow(2, length);

        for (int i = 0; i < pow; i++) {
            List<Integer> integers = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i >> j & 1) == 1) {
                    integers.add(nums[j]);
                }
            }
            result.add(integers);
        }
        return result;
    }

    public static void main(String[] args) {
        Interview0804 interview0804 = new Interview0804();
        System.out.println(interview0804.subsets(new int[]{1, 2, 3}));
    }

}
