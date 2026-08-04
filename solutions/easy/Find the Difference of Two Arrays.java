// Title: Find the Difference of Two Arrays
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-difference-of-two-arrays/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
         for(int num:nums2){
            set2.add(num);
        }
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for(int num:set1){
              if(!set2.contains(num)){
                list1.add(num);
