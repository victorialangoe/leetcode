// here I use PalindromeNumber as inspo, the task is from https://leetcode.com/problems/reverse-integer/submissions

package medium;

public class ReverseInteger {
    public int reverse(int x) {
        String str = Integer.toString(x);
        String strReverse = "";
        char temp = '0';
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '-') {
                temp = '-';
            } else {
                strReverse = strReverse + str.charAt(i);
            }
        }
        strReverse = temp + strReverse;
        int reversedInt = 0;
        try {
            reversedInt = Integer.parseInt(strReverse);
        } catch (NumberFormatException e) {
            reversedInt = 0;
        }
        if (reversedInt >= Math.pow(-2, 31) && reversedInt <= (Math.pow(2, 31) - 1)) {
            return reversedInt;
        } else {
            return 0;
        }
    }

}
