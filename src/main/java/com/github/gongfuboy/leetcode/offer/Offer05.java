package com.github.gongfuboy.leetcode.offer;

public class Offer05 {

    public String replaceSpace(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        char[] chars = s.toCharArray();
        char[] temp = new char[chars.length * 3];
        int index = 0;
        for (char tempChar : chars) {
            if (tempChar == ' ') {
                temp[index] = '%';
                index ++;
                temp[index] = '2';
                index ++;
                temp[index] = '0';
            } else {
                temp[index] = tempChar;
            }
            index ++;
        }
        char[] resultChar = new char[index];
        for (int i = 0; i < index; i++) {
            resultChar[i] = temp[i];
        }

        return String.valueOf(resultChar);
    }

}
