import java.util.*;

class Solution {
    private int maxStart = 0;
    private int maxLength = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        for (int i = 0; i < s.length(); i++) {
            expandFromCenter(s, i, i);

            expandFromCenter(s, i, i + 1);
        }

        return s.substring(maxStart, maxStart + maxLength);
    }

    private void expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        int currentLength = right - left - 1;//3

        if (currentLength > maxLength) {
            maxLength = currentLength;//3
            maxStart = left + 1;//0
        }
    }
}


public class Palindromic {
    public static void main() {
        String s = "babad";
        Solution solution = new Solution();
        String ans = solution.longestPalindrome(s);
        System.out.println(ans);
    }
}