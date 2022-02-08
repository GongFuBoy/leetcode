package com.github.gongfuboy.leetcode.offer;

public class Offer67 {

    public int strToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int result = 0;
        int index = 0;
        boolean flag = true;
        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }
        if (index < str.length() && str.charAt(index) == '-') {
            flag = false;
        }
        if (index < str.length() && (str.charAt(index) == '-' || str.charAt(index) == '+')) {
            index++;
        }

        while (index < str.length() && isDigit(str.charAt(index))) {
            int raise = str.charAt(index) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && raise > 7)) {
                return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + raise;
            index++;
        }

        return flag ? result : -result;
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

}
