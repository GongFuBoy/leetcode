package com.github.gongfuboy.leetcode.offer;

public class Offer15 {

    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result = result + (n & 1);
            n = n >>> 1;
        }

        return result;
    }


    public static void main(String[] args) {

        Offer15 offer15 = new Offer15();
        System.out.println(offer15.hammingWeight(11));
    }

}
