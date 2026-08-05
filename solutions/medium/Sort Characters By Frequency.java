// Title: Sort Characters By Frequency
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-characters-by-frequency/

        }
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(char ch:bucket[i]){
                    int freq=i;
                    while(freq-->0){
                        ans.append(ch);
                    }
                }
            }
        }
        return ans.toString();

