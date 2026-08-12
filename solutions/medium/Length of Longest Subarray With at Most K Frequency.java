// Title: Length of Longest Subarray With at Most K Frequency
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0;
        int maxlength=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int right=0;right<nums.length;right++){
              map.put(nums[right],map.getOrDefault(nums[right],0)+1);
              while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
              }
              maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
                left++;
