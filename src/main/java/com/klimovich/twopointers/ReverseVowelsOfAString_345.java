package com.klimovich.twopointers;

import java.util.*;

/*
https://leetcode.com/problems/reverse-vowels-of-a-string/description/
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
================================
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
 */
public class ReverseVowelsOfAString_345 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'));
        while (left < right) {
            char leftChar = chars[left];
            char rightChar = chars[right];
            if (vowels.contains(leftChar)) {
                if (vowels.contains(rightChar)) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                }
                right--;
            } else {
                left++;
            }
        }
        return new String(chars);
    }
}
