package com.klimovich.linkedlist;

/*
https://leetcode.com/problems/reverse-linked-list/description/
Given the head of a singly linked list, reverse the list, and return the reversed list.
==============================
Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
==============================
Example 2:
Input: head = [1,2]
Output: [2,1]
 */
public class ReverseLinkedList_206 {
    public ListNode reverseList(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
