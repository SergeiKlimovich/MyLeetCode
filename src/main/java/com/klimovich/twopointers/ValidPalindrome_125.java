package com.klimovich.twopointers;

/*
https://leetcode.com/problems/valid-palindrome/description/
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
==============================================
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String fixed = s.toLowerCase();
        int startElement = 0;
        int endElement = fixed.length() - 1;
        while (startElement < endElement) {
            char start = fixed.charAt(startElement);
            char end = fixed.charAt(endElement);
            if (!Character.isLetterOrDigit(start)) {
                startElement++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)) {
                endElement--;
                continue;
            }
            if (start != end) {
                return false;
            }
            startElement++;
            endElement--;
        }
        return true;
    }
}
