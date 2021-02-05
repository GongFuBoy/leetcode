package com.github.gongfuboy.leetcode.offer;


public class Offer58_1 {

    public String reverseWords(String s) {

        if (s == null) {
            return null;
        }
        char[] chars = s.toCharArray();

        if (chars.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();

        int i = chars.length - 1;
        int j = i;

        while (i >= 0) {
            while (i >= 0 && chars[i] != ' ') {
                i--;
            }
            result.append(s, i + 1, j + 1).append(" ");

            while (i >= 0 && chars[i] == ' ') {
                i--;
            }
            j = i;
        }

        return result.toString().trim();
    }

}
