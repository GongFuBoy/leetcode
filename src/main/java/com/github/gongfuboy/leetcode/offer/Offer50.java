package com.github.gongfuboy.leetcode.offer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Offer50 {

    public char firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return ' ';
        }
        HashMap<Character, Boolean> dicMap = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (dicMap.containsKey(chars[i])) {
                dicMap.put(chars[i], false);
            } else {
                dicMap.put(chars[i], true);
            }
        }

        for (Map.Entry<Character, Boolean> entry : dicMap.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return ' ';
    }

}
