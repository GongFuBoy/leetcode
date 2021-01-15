package com.github.gongfuboy.leetcode.offer;

import java.util.Stack;

public class Offer31 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {

        if (isEmpty(pushed) && isEmpty(popped)) {
            return true;
        } else if (isEmpty(pushed) && !isEmpty(popped)) {
            return false;
        } else if (!isEmpty(pushed) && isEmpty(popped)) {
            return false;
        } else {
            int index = 0;
            Stack<Integer> integers = new Stack<>();
            for (int pushInt : pushed) {
                integers.push(pushInt);
                while (!integers.isEmpty() && integers.peek() == popped[index]) {
                    integers.pop();
                    index++;
                }
            }
            return integers.isEmpty();
        }
    }

    private boolean isEmpty(int[] arr) {
        return arr == null || arr.length == 0;
    }

}
