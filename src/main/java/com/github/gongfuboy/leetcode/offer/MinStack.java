package com.github.gongfuboy.leetcode.offer;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> sourceStack = new Stack<>();

    private Stack<Integer> assistStack = new Stack<>();

    public MinStack() {

    }

    public void push(int x) {
        sourceStack.push(x);
        if (assistStack.isEmpty() || assistStack.peek() >= x) {
            assistStack.push(x);
        }
    }

    public void pop() {
        if (sourceStack.pop().equals(assistStack.peek())) {
            assistStack.pop();
        }
    }

    public int top() {
        return sourceStack.peek();
    }

    public int min() {
        return assistStack.peek();
    }

}
