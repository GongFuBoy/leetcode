package com.github.gongfuboy.leetcode.easy;

/**
 * Created by GongFuBoy on 2020/4/25.
 *
 * 最长公共前缀
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 */
public class Solution14 {

    /**
     * 暴力解法
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String indexString = strs[0];

        StringBuilder result = new StringBuilder();
        char[] sourceCharArr = indexString.toCharArray();
        for (int i = 0; i < sourceCharArr.length; i++) {
            char sourceChar = sourceCharArr[i];
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].toCharArray().length > i && strs[j].toCharArray()[i] == sourceChar) {
                } else {
                    return result.toString();
                }
            }
            result.append(sourceChar);
        }
        return result.toString();
    }

    /**
     * todo 字典树解法
     * @param strs
     * @return
     */
    public String longestCommonPrefix1(String[] strs) {


        return "";
    }

    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(solution14.longestCommonPrefix(strings));
    }

}
