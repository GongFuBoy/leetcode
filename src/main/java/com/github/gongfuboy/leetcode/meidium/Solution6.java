package com.github.gongfuboy.leetcode.meidium;

/**
 * Created by GongFuBoy on 2020/4/22.
 */
public class Solution6 {

    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 1) return s;
        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }

        char[] chars = s.toCharArray();
        int index = 0;
        int step = 1;
        for (int i = 0; i < chars.length; i++) {
            arr[index].append(chars[i]);
            if (index == 0) step = 1;
            else if (index == numRows - 1) step = -1;
            index += step;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : arr) {
            result.append(stringBuilder.toString());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        System.out.println(solution6.convert("PAYPALISHIRING", 3));
    }

}
