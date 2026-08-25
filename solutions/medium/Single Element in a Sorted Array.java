// Title: Single Element in a Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/single-element-in-a-sorted-array/

        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]==nums[mid^1]){
        }
            } else{
                 left=mid+1;
                right=mid;
            }
    
        return nums[left];
    }
        int right=nums.length-1;
        int left=0;
    public int singleNonDuplicate(int[] nums) {
class Solution {
