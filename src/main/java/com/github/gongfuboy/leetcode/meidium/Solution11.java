package com.github.gongfuboy.leetcode.meidium;

/**
 * 盛最多水的容器
 *
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai)
 * 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */
public class Solution11 {

    /**
     * 暴力法
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int high = Math.min(height[i], height[j]);
                int wide = j - i;
                int volume = high * wide;
                max = Math.max(max, volume);
            }
        }
        return max;
    }

    /**
     * 双指针法
     * @param height
     * @return
     */
    public int maxArea1(int[] height) {
        int max = 0;
        int startIndex = 0;
        int endIndex = height.length - 1;
        while (startIndex != endIndex) {
            int wide = endIndex - startIndex;
            int high = Math.min(height[startIndex], height[endIndex]);
            max = Math.max(max, wide * high);
            if (height[startIndex] > height[endIndex]) {
                endIndex--;
            } else {
                startIndex++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution11.maxArea1(arr));
    }


}
