package com.klimovich.twopointers;

import java.util.Arrays;

/*
https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
Return the minimum possible difference.
====================================
Example:
Input: nums = [9,4,1,7], k = 2
Output: 2
 */
public class MinimumDifferenceBetweenHighestAndLowestOfKScores_1984 {
  public static void main(String[] args) {
    int[] nums = new int[]{9, 4, 1, 7};
    int k = 2;
    System.out.println(minimumDifference(nums, k));
  }

  public static int minimumDifference(int[] nums, int k) {
    Arrays.sort(nums);
    int length = nums.length - k + 1;
    int i = 0;
    int j = nums.length - 1;
    int min = Math.abs(nums[0] - nums[k - 1]);
    while (i < j) {
      if ((i + k - 1) >= nums.length || (j - k + 1) < 0) {
        break;
      }
      int diff = Math.min(Math.abs(nums[i] - nums[i + k - 1]), Math.abs(nums[j] - nums[j - k + 1]));
      min = Math.min(min, diff);
      i++;
      j--;
    }
    return min;
  }

  public static int minimumDifference1(int[] nums, int k) {
    Arrays.sort(nums);
    int length = nums.length - k + 1;
    int min = Math.abs(nums[0] - nums[k - 1]);
    for (int i = 1; i < length; i++) {
      int diff = Math.abs(nums[i] - nums[i + k - 1]);
      min = Math.min(min, diff);
    }
    return min;
  }
}