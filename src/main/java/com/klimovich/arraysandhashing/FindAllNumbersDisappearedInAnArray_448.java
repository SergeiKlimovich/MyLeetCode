package com.klimovich.arraysandhashing;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
 */
public class FindAllNumbersDisappearedInAnArray_448 {
  public static void main(String[] args) {
    int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
    System.out.println(findDisappearedNumbers(nums));
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new ArrayList<>();
    int[] appears = new int[nums.length + 1];
    for (int num : nums) {
      appears[num]++;
    }
    for (int i = 1; i <= nums.length; i++) {
      if (appears[i] == 0) {
        result.add(i);
      }
    }
    return result;
  }
}
