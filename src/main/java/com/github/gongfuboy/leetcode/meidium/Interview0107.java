package com.github.gongfuboy.leetcode.meidium;

/**
 * Created by GongFuBoy on 2020/5/5.
 *
 * 旋转矩阵
 *
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 *
 * 不占用额外内存空间能否做到？
 *
 *  
 *
 * 示例 1:
 *
 * 给定 matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 * 示例 2:
 *
 * 给定 matrix =
 * [
 *   [ 5, 1, 9,11],
 *   [ 2, 4, 8,10],
 *   [13, 3, 6, 7],
 *   [15,14,12,16]
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [15,13, 2, 5],
 *   [14, 3, 4, 1],
 *   [12, 6, 8, 9],
 *   [16, 7,10,11]
 * ]
 *
 * A[i][j] => A[j][n - 1 - i]
 * A[j][n - 1 - i] => A[n - 1 - i][n - 1 - j]
 * A[n - 1 - i][n - 1 - j] => A[n - 1 - j][n - 1 - (n - 1 -i)] => A[n - 1 - j][i]
 * A[n - 1 - j][i] => A[i][j]
 *
 */
public class Interview0107 {

    public void rotate(int[][] matrix) {
        if (matrix == null) return;
        int length = matrix.length;
        int temp;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < (matrix.length + 1) / 2; j++) {
                temp = matrix[length - 1 - j][i];
                matrix[length - 1 - j][i] = matrix[length - 1 - i][length - 1 - j];
                matrix[length - 1 - i][length - 1 - j] = matrix[j][length - 1 - i];
                matrix[j][length - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        System.out.println("-----");
    }

    public static void main(String[] args) {
        Interview0107 interview0107 = new Interview0107();
        int[][] ints = new int[3][3];
        ints[0] = new int[]{1,2,3};
        ints[1] = new int[]{4,5,6};
        ints[2] = new int[]{7,8,9};
        interview0107.rotate(ints);
    }

}
