package com.klimovich.arraysandhashing;

/*
https://leetcode.com/problems/design-hashset/description/
Design a HashSet without using any built-in hash table libraries.
Implement MyHashSet class:
void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
Constraints:
0 <= key <= 10e6
At most 10e4 calls will be made to add, remove, and contains.
====================================
Example 1:
Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]
 */
public class DesignHashSet_705 {
  static class MyHashSet {
    boolean arr[];

    public MyHashSet() {
      arr = new boolean[1000001];
    }

    public void add(int key) {
      arr[key] = true;
    }

    public void remove(int key) {
      arr[key] = false;
    }

    public boolean contains(int key) {
      return arr[key];
    }
  }
}
