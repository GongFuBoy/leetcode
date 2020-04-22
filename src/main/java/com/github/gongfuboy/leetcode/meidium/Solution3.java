package com.github.gongfuboy.leetcode.meidium;

import java.util.HashSet;

/**
 * 最大不重复子串
 */
public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        int result = 0,start = 0, end = 0;

        HashSet<Character> characters = new HashSet<Character>();
        while (start < s.length() && end < s.length()) {
            if (!characters.contains(s.charAt(end))) {
                characters.add(s.charAt(end));
                end++;
                result = Math.max(result, end - start);
            } else {
                characters.remove(s.charAt(start));
                start++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.lengthOfLongestSubstring("pwwkew"));
    }

}
