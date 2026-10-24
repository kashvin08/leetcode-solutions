import java.util.*;

class Solution {
    public String addBinary(String a, String b) {
        int p1 = a.length() - 1;
        int p2 = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while(p2 >= 0 || p1 >= 0 || carry > 0){
            int sum = carry;

            if (p1 >= 0) {
                sum += a.charAt(p1) - '0';
                p1--;
            }

            if (p2 >= 0) {
                sum += b.charAt(p2) - '0';
                p2--;
            }

            sb.append(sum % 2);

            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
}

public class AddBinary{
    public static void main(String[] args){
      String a = "11";
      String b = "1";
      Solution sol = new Solution();
      String ans = sol.addBinary(a, b);
      System.out.println(ans);
    }
}
