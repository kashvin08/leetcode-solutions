import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

public class ContainsDuplicate {
    public static void main() {
        int[] nums = {3,3};
        Solution sol = new Solution();
        boolean ans = sol.containsDuplicate(nums);
        System.out.println(ans);
    }
}