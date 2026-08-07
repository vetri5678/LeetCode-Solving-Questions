// Title: Degree of an Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/degree-of-an-array/

          }
            length=i-firstseen.get(nums[i])+1;
          else if(count.get(nums[i])==greatest){
            length=Math.min(length,i-firstseen.get(nums[i])+1);
          }
            greatest=count.get(nums[i]);
          count.put(nums[i],count.getOrDefault(nums[i],0)+1);
          if(count.get(nums[i])>greatest){
            }
                firstseen.put(nums[i],i);
            if(!firstseen.containsKey(nums[i])){
        for(int i=0;i<nums.length;i++){
        int greatest=0;
