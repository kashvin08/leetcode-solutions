import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Boolean result = false;
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(seen.containsKey(nums[i])){
                int j = seen.get(nums[i]);
                if (Math.abs(i - j) <= k) {
                    return true;
                }
            }
            seen.put(nums[i], i);
        }
        return false;
    }
}

public class ContainsDuplicateII {
    public static void main() {
        int[] nums = {1,2,3,1};
        int k = 3;

        Solution sol = new Solution();
        System.out.println(sol.containsNearbyDuplicate(nums, k));
    }
}