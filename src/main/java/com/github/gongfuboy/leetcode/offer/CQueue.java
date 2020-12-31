package com.github.gongfuboy.leetcode.offer;

import java.util.Stack;

public class CQueue {

    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public CQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        int result = -1;

        if (inStack.isEmpty()) {
            return result;
        }
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
        result = outStack.pop();
        while (!outStack.isEmpty()) {
            inStack.push(outStack.pop());
        }
        return result;
    }

}
