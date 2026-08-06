// Title: Smallest Divisible Digit Product I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/smallest-divisible-digit-product-i/

class Solution {
    public int smallestNumber(int n, int t) {
          while(true){
            int num=n;
            int product=1;
            while(num!=0){
                product=product*(num%10);
                num/=10;
            }
            if(product%t==0){
                return n;
            }
            n++;
          }
