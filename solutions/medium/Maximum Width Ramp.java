// Title: Maximum Width Ramp
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-width-ramp/

       }
       int ans=0;
       for(int j=nums.length-1;j>=0;j--){
        while(!st.isEmpty()&&nums[j]>=nums[st.peek()]){
            ans=Math.max(ans,j-st.pop());
        }
        }
       }
       return ans;
    }
}
