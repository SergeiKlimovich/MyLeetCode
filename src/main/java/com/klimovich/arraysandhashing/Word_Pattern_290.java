package com.klimovich.arraysandhashing;

import java.util.HashMap;

/*
https://leetcode.com/problems/word-pattern/description/
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
=============================================
Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
=============================================
Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
 */
public class Word_Pattern_290 {
  public static void main(String[] args) {
    String pattern = "abba";
    String s = "dog cat cat dog";
    System.out.println(wordPattern(pattern, s));
  }

  public static boolean wordPattern(String pattern, String s) {
    HashMap<Character, String> map = new HashMap<>();
    String[] words = s.split(" ");
    if (pattern.length() != words.length) {
      return false;
    }
    for (int i = 0; i < words.length; i++) {
      char c = pattern.charAt(i);
      String word = words[i];
      if (map.containsKey(c)) {
        if (!map.get(c).equals(word)) {
          return false;
        }
      } else {
        if (map.containsValue(word)) {
          return false;
        }
        map.put(c, word);
      }
    }
    return true;
  }
}
