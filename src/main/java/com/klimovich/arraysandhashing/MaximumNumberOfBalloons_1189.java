package com.klimovich.arraysandhashing;

import java.util.HashMap;

/*
https://leetcode.com/problems/maximum-number-of-balloons/
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
You can use each character in text at most once. Return the maximum number of instances that can be formed.
====================================
Example 1:
Input: text = "nlaebolko"
Output: 1
====================================
Example 2:
Input: text = "loonbalxballpoon"
Output: 2
 */
public class MaximumNumberOfBalloons_1189 {
  public static void main(String[] args) {
    String text = "nlaebolko";
    System.out.println(maxNumberOfBalloons(text));
  }

  public static int maxNumberOfBalloons(String text) {
    int result = 0;
    int[] charCounts = new int[26];
    String balloon = "balloon";
    char[] balloonArray = balloon.toCharArray();
    char[] textArray = text.toCharArray();
    for (char c : textArray) {
      charCounts[c - 'a']++;
    }
    while (true) {
      for (char c : balloonArray) {
        charCounts[c - 'a']--;
        if (charCounts[c - 'a'] < 0) {
          return result;
        }
      }
      result++;
    }
  }

  public static int maxNumberOfBalloons1(String text) {
    int result = text.length();
    HashMap<Character, Integer> balloonMap = new HashMap<>();
    HashMap<Character, Integer> textMap = new HashMap<>();
    char[] balloonArray = "balloon".toCharArray();
    for (char c : balloonArray) {
      if (balloonMap.containsKey(c)) {
        balloonMap.put(c, balloonMap.get(c) + 1);
      } else {
        balloonMap.put(c, 1);
      }
    }
    char[] textArray = text.toCharArray();
    for (char c : textArray) {
      if (textMap.containsKey(c)) {
        textMap.put(c, textMap.get(c) + 1);
      } else {
        textMap.put(c, 1);
      }
    }
    for (Character c : balloonMap.keySet()) {
      result = Math.min(result, textMap.getOrDefault(c, 0) / balloonMap.get(c));
    }
    return result;
  }
}
