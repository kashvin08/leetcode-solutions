class Solution {//LC easy
    public boolean isPalindrome(int num) {
        int copy = num;
        int sum = 0;
        while (copy > 0) {//0
            int digit = copy % 10;//2
            sum = sum * 10 + digit;//202
            copy /= 10;
        }
        if (sum == num) {
            System.out.println("is a palindrome");
            return true;
        } else {
            System.out.println("is not a palindrome");
            return false;
        }
    }
}

public class IsPalindrome {
    public static void main(String[] args) {
        int num = 2021;
        Solution sol = new Solution();
        sol.isPalindrome(num);
    }
}
