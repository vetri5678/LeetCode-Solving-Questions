// Title: Smallest Missing Multiple of K
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/smallest-missing-multiple-of-k/

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int multiple=k;
        while(set.contains(multiple)){
            multiple+=k;
        }
    }
        return multiple;
}
