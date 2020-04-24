package com.github.gongfuboy.leetcode.meidium;

/**
 * Created by GongFuBoy on 2020/4/24.
 *
 * 整数转罗马数字
 *
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
 * 所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: "III"
 * 示例 2:
 *
 * 输入: 4
 * 输出: "IV"
 * 示例 3:
 *
 * 输入: 9
 * 输出: "IX"
 * 示例 4:
 *
 * 输入: 58
 * 输出: "LVIII"
 * 解释: L = 50, V = 5, III = 3.
 * 示例 5:
 *
 * 输入: 1994
 * 输出: "MCMXCIV"
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 *
 */
public class Solution12 {

    /**
     * 暴力解法
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        int thousandNum = num / 1000;
        int hundredNum = (num % 1000) / 100;
        int tenNum = (num % 100) / 10;
        int oneNum = (num % 10);
        if (thousandNum > 3) return "";

        // 处理千位数值
        for (int i = 0; i < thousandNum; i++) {
            result.append("M");
        }

        // 处理百位数值
        if (hundredNum >= 9) {
            result.append("CM");
        } else if (hundredNum >= 5){
            result.append("D");
            int realHundredNum = hundredNum % 5;
            for (int i = 0; i < realHundredNum; i++) {
                result.append("C");
            }
        } else if (hundredNum == 4) {
            result.append("CD");
        } else {
            for (int i = 0; i < hundredNum; i++) {
                result.append("C");
            }
        }

        // 处理十位
        if (tenNum >= 9) {
            result.append("XC");
        } else if (tenNum >= 5){
            result.append("L");
            int realTenNum = tenNum % 5;
            for (int i = 0; i < realTenNum; i++) {
                result.append("X");
            }
        } else if (tenNum == 4) {
            result.append("XL");
        } else {
            for (int i = 0; i < tenNum; i++) {
                result.append("X");
            }
        }

        if (oneNum >= 9) {
            result.append("IX");
        } else if (oneNum >= 5){
            result.append("V");
            int realOneNum = oneNum % 5;
            for (int i = 0; i < realOneNum; i++) {
                result.append("I");
            }
        } else if (oneNum == 4) {
            result.append("IV");
        } else {
            for (int i = 0; i < oneNum; i++) {
                result.append("I");
            }
        }

        return result.toString();
    }

    /**
     * 贪心算法
     * @param num
     * @return
     */
    public String intToRoman1(int num) {
        StringBuilder result = new StringBuilder();
        if (num >= 4000) return "";
        int[] numArr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanArr = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int index = 0;
        while (index < 13) {
            while (num >= numArr[index]) {
                result.append(romanArr[index]);
                num = num - numArr[index];
            }
            index++;
        }
        return result.toString();
    }


    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.intToRoman(58));
    }

}
