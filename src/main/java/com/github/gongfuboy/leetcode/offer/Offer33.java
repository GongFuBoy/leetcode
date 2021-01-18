package com.github.gongfuboy.leetcode.offer;

public class Offer33 {

    public boolean verifyPostorder(int[] postorder) {
        return cur(postorder, 0, postorder.length - 1);
    }

    private boolean cur(int[] arr, int start, int end) {
        if (start >= end) return true;
        int temp = start;
        while (arr[temp] < arr[end]) temp++;
        int m = temp;
        while (arr[temp] > arr[end]) temp++;
        return temp == end && cur(arr, start, m - 1) && cur(arr, m, end - 1);
    }

}
