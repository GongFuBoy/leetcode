package com.github.gongfuboy.leetcode.offer;


import java.util.HashMap;
import java.util.Map;

public class Offer39 {

    public int majorityElement(int[] nums) {

        if (nums == null) {
            return -1;
        }
        if (nums.length  == 0) {
            return -1;
        }

        HashMap<Integer, Integer> tempHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (tempHashMap.containsKey(nums[i])) {
                Integer count = tempHashMap.get(nums[i]);
                count++;
                tempHashMap.put(nums[i], count);
            } else {
                tempHashMap.put(nums[i], 1);
            }
        }

        int tempCount = -1;
        int result = -1;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : tempHashMap.entrySet()) {
            if (integerIntegerEntry.getValue() > tempCount) {
                result = integerIntegerEntry.getKey();
                tempCount = integerIntegerEntry.getValue();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Offer39 offer39 = new Offer39();
        System.out.println(offer39.majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }

}
