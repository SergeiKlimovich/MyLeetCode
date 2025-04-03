package com.klimovich.stack;

import java.util.Stack;

/*
https://leetcode.com/problems/decode-string/description/
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
Note that k is guaranteed to be a positive integer.
You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc.
Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k.
For example, there will not be input like 3a or 2[4].
The test cases are generated so that the length of the output will never exceed 105.
================================
Example 1:
Input: s = "3[a]2[bc]"
Output: "aaabcbc"
================================
Example 2:
Input: s = "3[a2[c]]"
Output: "accaccacc"
 */
public class DecodeString_394 {
    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int number = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number = number * 10 + c - '0';
            } else if (c == '[') {
                countStack.push(number);
                number = 0;
                stringStack.push(currentString);
                currentString = new StringBuilder();

            } else if (c == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder basicString = stringStack.pop();
                basicString.append(currentString.toString().repeat(repeatTimes));
                currentString = basicString;
            } else {
                currentString.append(c);
            }
        }
        return currentString.toString();
    }
}
