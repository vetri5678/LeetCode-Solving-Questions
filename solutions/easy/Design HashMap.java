// Title: Design HashMap
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/design-hashmap/

class MyHashMap {
      int []map=new int[10000001];
    public MyHashMap() {
       
        Arrays.fill(map,-1);
    }
    
    public void put(int key, int value) {
        map[key]=value;
    }
    
