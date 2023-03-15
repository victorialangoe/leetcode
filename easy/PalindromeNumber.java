// from https://leetcode.com/problems/palindrome-number/
// solved 15.03.2023

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String strReverse = ""; 
        for (int i = str.length()-1; i >= 0; i--){
            strReverse = strReverse + str.charAt(i);
            
        }
        if (strReverse.equals(str)){
            return true;
        }
        return false;
    }
}