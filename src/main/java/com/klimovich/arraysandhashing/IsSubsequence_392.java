package com.klimovich.arraysandhashing;

/*
https://leetcode.com/problems/is-subsequence/description/
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
of the characters without disturbing the relative positions of the remaining characters.
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
================================
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
================================
Example 2:
Input: s = "aaaaaa", t = "bbaaaa"
Output: false
 */
public class IsSubsequence_392 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int sElement = 0;
        int tElement = 0;
        while (tElement < t.length()) {
            if (s.charAt(sElement) == t.charAt(tElement)) {
                sElement++;
                if (sElement == s.length()) {
                    return true;
                }
            }
            tElement++;
        }
        return false;
    }
}