// Title: Custom Sort String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/custom-sort-string/

        for(int i=0;i<s.length();i++){
            if(!used[i]){
                used[i]=true;
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
