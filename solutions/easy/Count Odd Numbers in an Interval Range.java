// Title: Count Odd Numbers in an Interval Range
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
