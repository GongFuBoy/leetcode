package com.github.gongfuboy.leetcode.meidium;

/**
 * 整数翻转
 */
public class Solution7 {

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int temp = x % 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && temp > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && temp < Integer.MIN_VALUE % 10)) {
                return 0;
            }
            result = result * 10 + temp;
            x = x / 10;
        }
        return result;
    }
}
