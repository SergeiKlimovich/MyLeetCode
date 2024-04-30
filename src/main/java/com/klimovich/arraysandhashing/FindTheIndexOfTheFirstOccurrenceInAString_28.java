package com.klimovich.arraysandhashing;

/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
===========================================
Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
 */
public class FindTheIndexOfTheFirstOccurrenceInAString_28 {
  public static void main(String[] args) {
    String haystack = "sadbutsad";
    String needle = "sad";
    System.out.println(strStr(haystack, needle));
  }

  public static int strStr(String haystack, String needle) {
    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
      if (haystack.charAt(i) == needle.charAt(0)) {
        if (haystack.startsWith(needle, i)) {
          return i;
        }
      }
    }
    return -1;
  }
}
