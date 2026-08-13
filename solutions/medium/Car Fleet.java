// Title: Car Fleet
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/car-fleet/

        Arrays.sort(position);
        int i= position.length-1;
        while(i>0){
           float c=map.get(position[i]);
           i--;
           while(i>=0&& c>=(float) map.get(position[i])){
            fleet--;
           }
            i--;
        }
         map.put(position[i],time);
         float time= (float) (target-position[i])/speed[i];
        Map<Integer,Float>map=new HashMap<>();
        for(int i=0;i<position.length;i++){
        int fleet=position.length;
    public int carFleet(int target, int[] position, int[] speed) {
class Solution {
        }
        return fleet;
    }
}
