class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int n = x;
        int revnum = 0;

        // Reverse the integer
        while (n > 0) {
            int d = n % 10;
            revnum = revnum * 10 + d;
            n = n / 10;
        }

        // Compare reversed number with original
        return revnum == x;
    }
}