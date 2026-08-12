// Title: Online Stock Span
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/online-stock-span/

    }
    
    public int next(int price) {
        int i=prices.size();
        prices.add(price);
        while(!IndexStack.isEmpty() && prices.get(IndexStack.peek())<=price){
            IndexStack.pop();
        }
        int stack;
       if(IndexStack.isEmpty()){
