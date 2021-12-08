package com.github.gongfuboy.leetcode.meidium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for (String str : strs) {
            int[] temp = new int[26];
            for (char c : str.toCharArray()) {
                temp[c - 'a'] = temp[c - 'a'] + 1;
            }

            StringBuilder tempSb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (temp[i] != 0) {
                    tempSb.append((char) i + 'a');
                    tempSb.append(temp[i]);
                }
            }

            String s = tempSb.toString();
            List<String> list = map.getOrDefault(s, new ArrayList<>());
            list.add(str);
            map.put(s, list);
        }

        return new ArrayList<>(map.values());
    }

}
