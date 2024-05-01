package com.klimovich.twopointers;

/*
https://leetcode.com/problems/reverse-string/description/
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
============================
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */
public class ReverseString_344 {
  public static void main(String[] args) {
    char[] chars = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
    reverseString(chars);
    System.out.println(chars);
  }

  public static void reverseString(char[] chars) {
    int left = 0;
    int right = chars.length - 1;
    char temp;
    while (left < right) {
      temp = chars[left];
      chars[left] = chars[right];
      chars[right] = temp;
      left++;
      right--;
    }
  }
}
