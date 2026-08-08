// Title: Reorganize String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/reorganize-string/

        int max = 0;
        int letter = 0;

        // Find character with maximum frequency

        for (int i = 0; i < 26; i++) {
            if (hash[i] > max) {
                max = hash[i];
                letter = i;
            }
        }

        // If maximum frequency is too large, impossible
        if (max > (s.length() + 1) / 2) {
            return "";
        }

        char res[] = new char[s.length()];
        int idx = 0;

        // Place most frequent character first
        while (hash[letter] > 0) {
            res[idx] = (char) (letter + 'a');
            hash[letter]--;
            idx += 2;
