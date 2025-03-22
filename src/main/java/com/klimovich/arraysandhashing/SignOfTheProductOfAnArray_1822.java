package com.klimovich.arraysandhashing;

/*
https://leetcode.com/problems/sign-of-the-product-of-an-array/description/
There is a function signFunc(x) that returns:
1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.
Return signFunc(product).
==================================
Example 1:
Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
 */
public class SignOfTheProductOfAnArray_1822 {
  public static void main(String[] args) {
    int[] nums = new int[]{-1, -2, -3, -4, 3, 2, 1};
    System.out.println(arraySign(nums));
  }

  public static int arraySign(int[] nums) {
    int countNegative = 0;
    for (int num : nums) {
      if (num == 0) {
        return 0;
      }
      if (num < 0) {
        countNegative++;
      }
    }
    if (countNegative % 2 == 0) {
      return 1;
    }
    return -1;
  }

  public static int arraySign1(int[] nums) {
    int sign = 1;
    for (int num : nums) {
      if (num == 0) {
        return 0;
      }
      if (num < 0) {
        sign = sign * -1;
      }
    }
    return sign;
  }
}
