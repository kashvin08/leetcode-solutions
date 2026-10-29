import java.util.*;

class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while(n != 1){
            if (seen.contains(n)){
                return false;
            }else {
                seen.add(n);

                int sum = 0;
                while (n > 0) {
                    int digit = n % 10;
                    sum += digit * digit;
                    n = n / 10;
                }
                n = sum;
            }
        }

        if(n == 1) return true;
        return true;
    }
}

public class HappyNumber {
    public static void main() {
        int n = 100;
        Solution sol = new Solution();
        System.out.println(sol.isHappy(n));
    }
}