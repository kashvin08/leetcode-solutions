import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        int acc = 0;

        for(int num : nums){
            acc ^= num;
        }
        return acc;
    }
}

public class SingleNumber {
    public static void main() {
        int[] nums = {4,2,1,5,2,1,4};
        Solution sol = new Solution();
        int ans = sol.singleNumber(nums);
        System.out.println(ans);
    }
}