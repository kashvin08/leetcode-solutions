import java.util.*;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
                    return x;
                }

                int start = 1;
                int end = x;
                int ans = 0;

                while (start <= end) {
                    int mid = start + (end - start) / 2;

                    // Use division (x / mid) instead of multiplication (mid * mid)
                    // to prevent integer overflow errors.
                    if (mid <= x / mid) {
                        ans = mid;      // mid could be the answer, save it
                        start = mid + 1; // Look for a larger integer
                    } else {
                        end = mid - 1;   // mid is too large, look smaller
                    }
                }

                return ans;
            }
}

public class Sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        Solution sol = new Solution();
        int ans = sol.mySqrt(x);
        System.out.println(ans);
        scanner.close();
    }
}