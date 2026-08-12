// Title: Baseball Game
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/baseball-game/

            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
    }
        return ans;
}
