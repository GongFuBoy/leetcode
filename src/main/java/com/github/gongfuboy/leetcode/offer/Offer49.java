package com.github.gongfuboy.leetcode.offer;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Offer49 {

    public int nthUglyNumber(int n) {
        HashSet<Long> distinctSet = new HashSet<>();
        PriorityQueue<Long> minStack = new PriorityQueue<>(Comparator.comparingLong(o -> o));
        int result = 1;
        int firstUglyNumber = 1;
        distinctSet.add((long) firstUglyNumber);
        minStack.add((long) firstUglyNumber);
        for (int i = 0; i < n; i++) {
            result = Math.toIntExact(minStack.poll());
            Long t2 = result * 2L;
            Long t3 = result * 3L;
            Long t5 = result * 5L;
            if (!distinctSet.contains(t2)) {
                minStack.add(t2);
                distinctSet.add(t2);
            }
            if (!distinctSet.contains(t3)) {
                minStack.add(t3);
                distinctSet.add(t3);
            }
            if (!distinctSet.contains(t5)) {
                minStack.add(t5);
                distinctSet.add(t5);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Offer49 offer49 = new Offer49();
        System.out.println(offer49.nthUglyNumber(10));
    }

}
