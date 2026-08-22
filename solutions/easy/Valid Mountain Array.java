// Title: Valid Mountain Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-mountain-array/

            i++;
        }
        if(i==arr.length-1||i==0){
            return false;
        }
         while(i<arr.length-1 && arr[i]>arr[i+1]){
            i++;
        }
        return (i==arr.length-1);
    }
}
