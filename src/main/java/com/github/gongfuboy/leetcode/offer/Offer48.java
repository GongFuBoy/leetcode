package com.github.gongfuboy.leetcode.offer;

import java.util.HashMap;

public class Offer48 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int startIndex = 0;
        int endIndex = 0;
        int result = 1;
        HashMap<Character, Integer> charAndIndexMap = new HashMap<>();
        while (endIndex < s.length()) {
            Integer endIndexChar = charAndIndexMap.get(s.charAt(endIndex));
            if (endIndexChar == null || endIndexChar < startIndex) {
                int newResultCharLength = endIndex - startIndex + 1;
                result = Math.max(result, newResultCharLength);
            } else {
                startIndex = endIndex + 1;
            }
            charAndIndexMap.put(s.charAt(endIndex), endIndex);
            endIndex++;
        }

        return result;
    }


    public static void main(String[] args) {
        Offer48 offer48 = new Offer48();
        System.out.println(offer48.lengthOfLongestSubstring("pwwkew"));
    }

}
