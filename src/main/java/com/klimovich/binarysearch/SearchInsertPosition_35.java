package com.klimovich.binarysearch;

/*
https://leetcode.com/problems/search-insert-position/description/
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
=======================================
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
 */
public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return left;
    }
}
