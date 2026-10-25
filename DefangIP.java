import java.util.*;

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        int left = 0;

        while(left < address.length()){
            char c = address.charAt(left);

            if (c == '.'){
                sb.append("[.]");
            }else{
                sb.append(c);
            }
            left++;
        }
        String result = sb.toString();
        return result;
    }
}

public class DefangIP {
    public static void main() {
        String address = "1.1.1.1";
        Solution sol = new Solution();
        String ans = sol.defangIPaddr(address);
        System.out.println(ans);
    }
}