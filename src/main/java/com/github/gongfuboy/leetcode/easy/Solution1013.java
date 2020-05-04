package com.github.gongfuboy.leetcode.easy;

/**
 * Created by GongFuBoy on 2020/5/4.
 * <p>
 * 将数组分成和相等的三个部分
 * <p>
 * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 * <p>
 * 形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i]
 * == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[0,2,1,-6,6,-7,9,1,2,0,1]
 * 输出：true
 * 解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
 * 示例 2：
 * <p>
 * 输入：[0,2,1,-6,6,7,9,-1,2,0,1]
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：[3,3,6,5,-2,2,5,1,-9,4]
 * 输出：true
 * 解释：3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
 *  
 * <p>
 * 提示：
 * <p>
 * 3 <= A.length <= 50000
 * -10^4 <= A[i] <= 10^4
 */
public class Solution1013 {

    public boolean canThreePartsEqualSum(int[] A) {

        if (A == null) return false;
        if (A.length < 3) return false;

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = A[i] + sum;
        }

        if (sum % 3 != 0) {
            return false;
        }

        int step1 = sum / 3;
        int step2 = (sum / 3);

        int index = 0;

        for (int i = 0; i < A.length; i++) {
            step1 = step1 - A[i];
            if (step1 == 0) {
                break;
            }
            index++;
        }

        if (index == A.length - 1) return false;

        for (int i = index + 1; i < A.length - 1; i++) {
            step2 = step2 - A[i];
            if (step2 == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution1013 solution1013 = new Solution1013();
        System.out.println(solution1013.canThreePartsEqualSum(new int[]{1, -1, 1, -1}));
    }

}
