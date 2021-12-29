package com.github.gongfuboy.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution169 {

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            boolean flag = valueMap.containsKey(nums[i]);
            if (flag) {
                Integer count = valueMap.get(nums[i]);
                count++;
                valueMap.put(nums[i], count);
            } else {
                valueMap.put(nums[i], 1);
            }
        }

        int resultCount = -1;
        int result = -1;
        for (Map.Entry<Integer, Integer> tempEntry : valueMap.entrySet()) {
            if (tempEntry.getValue() > resultCount) {
                resultCount = tempEntry.getValue();
                result = tempEntry.getKey();
            }
        }

        return result;

    }

}
