package com.github.gongfuboy.leetcode.easy;

import java.util.HashMap;

/**
 * Created by GongFuBoy on 2020/5/3.
 *
 * 总持续时间可被 60 整除的歌曲
 *
 * 在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。
 *
 * 返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。形式上，
 * 我们希望索引的数字 i 和 j 满足  i < j 且有 (time[i] + time[j]) % 60 == 0。
 *
 *
 * 示例 1：
 *
 * 输入：[30,20,150,100,40]
 * 输出：3
 * 解释：这三对的总持续时间可被 60 整数：
 * (time[0] = 30, time[2] = 150): 总持续时间 180
 * (time[1] = 20, time[3] = 100): 总持续时间 120
 * (time[1] = 20, time[4] = 40): 总持续时间 60
 * 示例 2：
 *
 * 输入：[60,60,60]
 * 输出：3
 * 解释：所有三对的总持续时间都是 120，可以被 60 整数。
 *  
 *
 * 提示：
 *
 * 1 <= time.length <= 60000
 * 1 <= time[i] <= 500
 *
 */
public class Solution1010 {

    public int numPairsDivisibleBy60(int[] time) {
        int result = 0;

        if (time == null) return result;
        if (time.length < 2) return result;

        HashMap<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < time.length; i++) {
            int i1 = time[i] % 60;
            if (resultMap.containsKey(i1)) {
                Integer count = resultMap.get(i1);
                count++;
                resultMap.put(i1, count);
            } else {
                resultMap.put(i1, 1);
            }
        }

        for (int i = 1; i < 30; i++) {
            Integer minCount = resultMap.get(i) == null ? 0 : resultMap.get(i);
            Integer maxCount = resultMap.get(60 - i) == null ? 0 : resultMap.get(60 - i);
            result = result + maxCount * minCount;
        }

        Integer midCount = resultMap.get(30) == null ? 0 : resultMap.get(30);
        result = result + (midCount - 1) * midCount / 2;
        Integer zeroCount = resultMap.get(0) == null ? 0 : resultMap.get(0);
        result = result + (zeroCount - 1) * zeroCount / 2;

        return result;
    }

}
