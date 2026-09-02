// Title: Minimum Speed to Arrive on Time
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-speed-to-arrive-on-time/

                 time+=Math.ceil(currenttime);
                
              }
              else{
               time+=currenttime;
              }
           }
           return time<=hour;
    }
}
