package com.klimovich.twopointers;

/*
https://leetcode.com/problems/merge-strings-alternately/description/
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
======================================
Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */
public class MergeStringsAlternately_1768 {
  public static void main(String[] args) {
    String word1 = "abcd";
    String word2 = "pq";
    System.out.println(mergeAlternately(word1, word2));
  }

  public static String mergeAlternately(String word1, String word2) {
    int i = 0;
    int j = 0;
    StringBuilder s = new StringBuilder();
    while (i < word1.length() || j < word2.length()) {
      if (i < word1.length()) {
        s.append(word1.charAt(i));
        i++;
      }
      if (j < word2.length()) {
        s.append(word2.charAt(j));
        j++;
      }
    }
    return s.toString();
  }
}
