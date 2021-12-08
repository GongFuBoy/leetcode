package com.github.gongfuboy.leetcode.offer;

public class Offer29 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Offer29 offer29 = new Offer29();
        int[] result = offer29.spiralOrder(arr);
        System.out.println("----------------");
    }


    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return new int[0];
        }
        int col = matrix[0].length;
        if (col == 0) {
            return new int[0];
        }

        int[] result = new int[row * col];

        int left = 0, top = 0, right = col - 1, button = row - 1;
        int index = 0;

        while (left <= right && top <= button) {
            for (int i = left; i <= right; i++) {
                result[index] = matrix[top][i];
                index++;
            }

            for (int i = top + 1; i <= button; i++) {
                result[index] = matrix[i][right];
                index++;
            }

            if (top != button) {
                for (int i = right - 1; i >= left; i--) {
                    result[index] = matrix[button][i];
                    index++;
                }
            }

            if (left != right) {
                for (int i = button - 1; i >= top + 1; i--) {
                    result[index] = matrix[i][left];
                    index++;
                }
            }

            left++;
            top++;
            right--;
            button--;
        }

        return result;

    }

}
