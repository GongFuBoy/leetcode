package com.github.gongfuboy.leetcode.offer;

public class Offer11 {

    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        if (numbers.length == 1) {
            return numbers[0];
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] <= numbers[i + 1]) {
                continue;
            } else {
                return numbers[i + 1];
            }
        }

        return numbers[0];
    }

}
