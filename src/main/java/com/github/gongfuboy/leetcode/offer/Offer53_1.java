package com.github.gongfuboy.leetcode.offer;

import java.util.HashMap;

public class Offer53_1 {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> targetAndCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = targetAndCount.getOrDefault(nums[i], 0) + 1;
            targetAndCount.put(nums[i], count);
        }

        return targetAndCount.getOrDefault(target, 0);


    }

}
