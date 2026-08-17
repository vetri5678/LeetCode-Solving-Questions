// Title: Find the Most Competitive Subsequence
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-most-competitive-subsequence/

                st.pop();
            }
        }
            if(st.size()<k){
                st.push(i);
            }
        int result[]=new int[k];
        for(int i=k-1;i>=0;i--){
            result[i]=nums[st.pop()];
        }
        return result;
    }
}
