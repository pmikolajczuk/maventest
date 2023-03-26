package pl.mikolaj.leetcode.palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
