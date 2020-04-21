package com.github.gongfuboy.leetcode.easy;

import java.util.HashMap;

/**
 * Created by ZhouLiMing on 2020/4/21.
 */
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> indexHashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int targetNum = target - nums[i];
            if (indexHashMap.containsKey(targetNum)) {
                return new int[]{indexHashMap.get(targetNum), i};
            } else {
                indexHashMap.put(nums[i], i);
            }
        }
        return new int[]{0, 0};
    }

}
