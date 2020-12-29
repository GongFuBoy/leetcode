package com.github.gongfuboy.leetcode.offer;

import java.util.HashMap;
import java.util.HashSet;

public class Offer03 {

    public int findRepeatNumber(int[] nums) {

        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int num : nums) {
            if (integerIntegerHashMap.containsKey(num)) {
                return num;
            } else {
                integerIntegerHashMap.put(num, num);
            }
        }
        return -1;
    }

}
