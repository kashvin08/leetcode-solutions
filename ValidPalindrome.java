import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        String copy = s.trim();
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
           char cLeft = s.charAt(left);
           char cRight = s.charAt(right);

           if (!Character.isLetterOrDigit(cLeft)){
               left++;
           }else if (!Character.isLetterOrDigit(cRight)){
               right--;
           }else{
               if(Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)){return false;}
               left++;
               right--;
           }
        }
    return true;

    }
}

public class ValidPalindrome {
    public static void main() {
        String s = "race car";
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(s));
    }
}