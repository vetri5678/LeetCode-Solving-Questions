// Title: Check Divisibility by Digit Sum and Product
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/

            int digit = num % 10;
            product *= digit;


            sum += digit;
            num /= 10;
        }

        int product = 1;

        while (num != 0) {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
class Solution {
