package com.github.gongfuboy.leetcode.meidium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution347 {

    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        HashMap<Integer, Integer> valueAndCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            valueAndCount.put(nums[i], valueAndCount.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> topKQueue = new PriorityQueue<>(
                Comparator.comparingInt(o -> o[1])
        );

        for (Map.Entry<Integer, Integer> entry : valueAndCount.entrySet()) {
            Integer key = entry.getKey();
            Integer count = entry.getValue();
            if (topKQueue.size() == k) {
                int[] minItem = topKQueue.peek();
                if (minItem[1] < count) {
                    topKQueue.poll();
                    topKQueue.add(new int[]{key, count});
                }
            } else {
                topKQueue.add(new int[]{key, count});
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = topKQueue.poll()[0];
        }
        return result;
    }

}
