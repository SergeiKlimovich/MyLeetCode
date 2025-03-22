package com.klimovich.binarysearch;

/*
https://leetcode.com/problems/sqrtx/description/
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
=======================================
Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
=======================================
Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */
public class SqrtX_69 {
    public static void main(String[] args) {
        int x = 9;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int start = 0;
        int end = x;
        int result = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > x / mid) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }
}
