package com.klimovich.arraysandhashing;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*
https://leetcode.com/problems/valid-anagram/description/
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
 */
public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagramFirst(s, t));
    }

    public static boolean isAnagramFirst(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        byte[] firstBytes = s.getBytes();
        byte[] secondBytes = t.getBytes();
        Arrays.sort(firstBytes);
        Arrays.sort(secondBytes);
        return Arrays.equals(firstBytes, secondBytes);
    }

    // solution using English alphabet
    public static boolean isAnagramSecond(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCounters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounters[s.charAt(i) - 'a']++;
            charCounters[t.charAt(i) - 'a']--;
        }
        for (int counter : charCounters) {
            if (counter != 0) {
                return false;
            }
        }
        return true;
    }

    // general solution for Unicode characters
    public static boolean isAnagramThird(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Long> sCounterMap = s.chars().mapToObj(value -> (char) value).collect(Collectors.groupingBy(character -> character, Collectors.counting()));
        Map<Character, Long> tCounterMap = t.chars().mapToObj(value -> (char) value).collect(Collectors.groupingBy(character -> character, Collectors.counting()));
        return sCounterMap.equals(tCounterMap);
    }
}

