package com.klimovich.windowsliding;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
Given a string s, find the length of the longest substring without repeating characters.
============================================
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {
  public static void main(String[] args) {
    String input = "abcabcbb";
    System.out.println(lengthOfLongestSubstring(input));
  }

  public static int lengthOfLongestSubstring(String s) {
    int left = 0;
    int right = 0;
    int result = 0;
    Set<Character> set = new HashSet<>();
    while (right < s.length()) {
      char c = s.charAt(right);
      if (!set.contains(c)) {
        set.add(c);
        result = Math.max(result, right - left + 1);
        right++;
      } else {
        while (set.contains(c)) {
          set.remove(s.charAt(left));
          left++;
        }
      }
    }
    return result;
  }
}







