package com.github.gongfuboy.leetcode.offer;

import java.util.LinkedList;
import java.util.Queue;

public class Offer13 {

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int result = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0, 0});
        while (queue.size() > 0) {
            int[] element = queue.poll();
            int i = element[0];
            int j = element[1];
            int si = element[2];
            int sj = element[3];
            if (i >= m || j >= n || visited[i][j] || si + sj > k) {
                continue;
            }
            visited[i][j] = true;
            result++;
            queue.add(new int[]{i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8});
            queue.add(new int[]{i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8 , sj});
        }

        return result;
    }

}
