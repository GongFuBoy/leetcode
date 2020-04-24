package com.github.gongfuboy.leetcode.meidium;

/**
 * 回文数
 *
 *
 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 示例 1:

 输入: 121
 输出: true
 示例 2:

 输入: -121
 输出: false
 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 示例 3:

 输入: 10
 输出: false
 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 进阶:

 你能不将整数转为字符串来解决这个问题吗？
 */
public class Solution9 {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long reverseNum = 0L;
        int remainderNum = x % 10;
        int nextLoopNum = x / 10;
        reverseNum = reverseNum * 10 + remainderNum;
        while (nextLoopNum > 0) {
            remainderNum = nextLoopNum % 10;
            nextLoopNum = nextLoopNum / 10;
            reverseNum = reverseNum * 10 + remainderNum;
        }
        return x == reverseNum;
    }

    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.isPalindrome(121));
    }

}
