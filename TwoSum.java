import java.util.*;

class Solution{
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                int index1 = seen.get(complement);
                int index2 = i;
                return new int[]{index1, index2};
            } else {
                seen.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,4,7,10,14};
        int target = 17;
        Solution sol = new Solution();
        int[] ans = sol.twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}
