import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int threshold = nums.length / 2;

        for(int num : nums){
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if(count > threshold){
                return num;
            }
        }
        return -1;
    }
}

public class MajorityElement {
    public static void main() {
        int[] nums = {3,2,3};
        Solution sol = new Solution();
        int ans = sol.majorityElement(nums);
        System.out.println(ans);
    }
}