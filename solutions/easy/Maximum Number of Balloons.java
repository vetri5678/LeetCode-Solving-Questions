// Title: Maximum Number of Balloons
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-number-of-balloons/

        }
        int b=map.getOrDefault('b',0);
        int a=map.getOrDefault('a',0);
        int l=map.getOrDefault('l',0)/2;
        int o=map.getOrDefault('o',0)/2;
        int n=map.getOrDefault('n',0);
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}
            map.put(num,map.getOrDefault(num,0)+1);
