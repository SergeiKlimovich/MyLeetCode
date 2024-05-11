package com.klimovich.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/description/
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
================================
Example 2:
Input: s = "()[]{}"
Output: true
 */
public class ValidParentheses_20 {
  public static void main(String[] args) {
    String s = "()[]{}";
    System.out.println(isValid(s));
  }

  public static boolean isValid(String s) {
    Map<Character, Character> map = new HashMap<>();
    map.put(')', '(');
    map.put(']', '[');
    map.put('}', '{');
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (!map.containsKey(c)) {
        stack.push(c);
      } else {
        char top = stack.isEmpty() ? '?' : stack.pop();
        if (top != map.get(c)) {
          return false;
        }
      }
    }
    return stack.empty();
  }
}
