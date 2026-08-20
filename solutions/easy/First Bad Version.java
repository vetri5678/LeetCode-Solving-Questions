// Title: First Bad Version
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/first-bad-version/

            if(isBadVersion(mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
            int mid=left+(right-left)/2;
        }
      
        return left;
    }
}
