package com.klimovich.arraysandhashing;

/*
https://leetcode.com/problems/length-of-last-word/
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
======================================================
Example 1:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
 */
public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String s = "joyboy";
        int i = lengthOfLastWord(s);
        System.out.println(i);
    }

    public static int lengthOfLastWord(String s) {
        String trim = s.trim();
        int length = 0;
        for (int i = trim.length() - 1; i >= 0; i--) {
            if (trim.charAt(i) != ' ') {
                length++;
            } else {
                break;
            }
        }
        return length;
    }
}
