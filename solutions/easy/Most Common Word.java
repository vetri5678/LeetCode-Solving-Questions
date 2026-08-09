// Title: Most Common Word
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/most-common-word/



            if (count.get(word) > maxcount) {

        int maxcount = 0;
        String wordmax = "";

        for (String word : count.keySet()) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
       
        for (String word : words) {

        
        String[] words = paragraph.toLowerCase().split("[^a-z]+");


        HashMap<String, Integer> count = new HashMap<>();
    public String mostCommonWord(String paragraph, String[] banned) {
class Solution {
