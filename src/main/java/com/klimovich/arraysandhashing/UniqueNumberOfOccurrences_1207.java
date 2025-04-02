package com.klimovich.arraysandhashing;

import java.util.*;

/*
https://leetcode.com/problems/unique-number-of-occurrences/description/
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
================================
Example 1:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
*/
public class UniqueNumberOfOccurrences_1207 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(nums));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return set.size()==map.size();
    }
}
