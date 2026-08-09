// Title: Brick Wall
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/brick-wall/

class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int untouched=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(List<Integer>row:wall){
            for(int brick=0;brick<row.size()-1;brick++){
                 end+=row.get(brick);
            }
        }
    }
            int end=0;

                 untouched=Math.max(untouched,map.get(end));


        return wall.size()-untouched;
                 map.put(end,map.getOrDefault(end,0)+1);
