package com.github.gongfuboy.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

public class Offer57_2 {

    public int[][] findContinuousSequence(int target) {
        int half = target / 2;
        int left = 1;
        int right = half;

        ArrayList<List<Integer>> result = new ArrayList<>();
        while (left < right) {
            int sum = sum(left, right);
            if (sum == target) {
                result.add(createList(left, right));
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return null;
    }

    private int sum(int left, int right) {
        return (left + right) * (right - left + 1) / 2;
    }

    private List<Integer> createList(int left, int right) {
        ArrayList<Integer> result = new ArrayList<>();
        for (; left <= right; left++) {
            result.add(left);
        }
        return result;
    }


}
