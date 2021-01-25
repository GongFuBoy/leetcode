package com.github.gongfuboy.leetcode.offer;

import java.util.HashMap;

public class Offer48 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        char[] chars = s.toCharArray();
        int j = -1, res = 0;
        HashMap<Character, Integer> charAndIndexHashMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (charAndIndexHashMap.containsKey(chars[i])) {
                j = Math.max(j, charAndIndexHashMap.get(chars[i]));
            }
            charAndIndexHashMap.put(chars[i], i);
            res = Math.max(res, i - j);
        }
        return res;
    }

}
