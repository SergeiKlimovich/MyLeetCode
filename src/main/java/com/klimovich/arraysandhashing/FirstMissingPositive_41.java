package com.klimovich.arraysandhashing;

import java.util.Arrays;

/*
https://leetcode.com/problems/first-missing-positive/description/
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
=====================================================
Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
======================================================
Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
 */
public class FirstMissingPositive_41 {
  public static void main(String[] args) {
    int[] nums = new int[]{2, 1};
    System.out.println(firstMissingPositive(nums));
  }

  public static int firstMissingPositive(int[] nums) {
    Arrays.sort(nums);
    int result = 1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == result) {
        result = result + 1;
      }
    }
    return result;
  }
}
