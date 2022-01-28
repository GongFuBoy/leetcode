package com.github.gongfuboy.leetcode.offer;

public class Offer66 {

    public int[] constructArr(int[] a) {
        if (a == null || a.length <= 1) {
            return a;
        }
        int[] left = new int[a.length];
        int[] right = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                left[i] = 1;
            } else {
                left[i] = left[i - 1] * a[i - 1];
            }
        }

        for (int j = a.length - 1; j >= 0; j--) {
            if (j == a.length - 1) {
                right[j] = 1;
            } else {
                right[j] = right[j + 1] * a[j + 1];
            }
        }

        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;

    }

    public static void main(String[] args) {
        Offer66 offer66 = new Offer66();
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(offer66.constructArr(ints));
    }

}
