// Title: Score of Parentheses
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/score-of-parentheses/

            } else {
                stack.push(0);
            if (c == '(') {
                int val = stack.pop();

                if (val == 0) {
                    val = 1;
                } else {
                    val = 2 * val;
                }

                int previous = stack.pop();
                stack.push(previous + val);
            }
        }

        return stack.pop();
    }
}
