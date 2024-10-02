package com.klimovich.twopointers;

import java.util.StringJoiner;

/**
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only
 * have a single space separating the words. Do not include any extra spaces.
 * ===========================================
 * Example 1:
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * -------------------------------------------
 * Example 2:
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseWordsInAString_151 {
    public static void main(String[] args) {
        String s = "  a good   example ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String trimString = s.trim();
        String[] strings = trimString.split(" ");
        for(int i = strings.length-1; i>=0; i--){
            if(!strings[i].isEmpty()){
                result.append(strings[i]).append(" ");
            }
        }
        return result.toString().trim();
    }
}
