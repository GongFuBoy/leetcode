package com.github.gongfuboy.leetcode.meidium;


/**
 * 字符串转整数
 */
public class Solution8 {

    public int myAtoi(String str) {
        long tempResult = 0;
        int result = 0;

        // 首先处理str前后空格
        String trim = str.trim();
        // 判断异常情况
        if (trim.length() == 0) return 0;
        if (!Character.isDigit(trim.toCharArray()[0]) && trim.toCharArray()[0] != '-' && trim.toCharArray()[0] != '+') {
            return 0;
        }
        boolean flag = trim.toCharArray()[0] == '-';
        int index = Character.isDigit(trim.toCharArray()[0]) ? 0 : 1;

        while (index < trim.length() && Character.isDigit(trim.toCharArray()[index])) {
            int sourceInt = trim.toCharArray()[index] - '0';
            tempResult = tempResult * 10 + sourceInt;
            if (flag && tempResult > Integer.MAX_VALUE + 1L) {
                return Integer.MIN_VALUE;
            }
            if (!flag && tempResult > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            index++;
        }

        if (flag) return (int) -tempResult;
        else return (int) tempResult;
    }

    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.myAtoi("-42"));
    }

}
