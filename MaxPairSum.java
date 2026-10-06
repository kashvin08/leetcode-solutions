import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        int maxResult = -1;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            int maxDigit = getMaxDigit(num);

            if(map.containsKey(maxDigit)){
                int currSum = map.get(maxDigit) + num;
                maxResult = Math.max(currSum, maxResult);
            }

            int existingMax = map.getOrDefault(maxDigit, 0);
            map.put(maxDigit, Math.max(existingMax, num));
        }
        return maxResult;
    }

    private int getMaxDigit(int num){
        int max = 0;
        while(num > 0){
            max = Math.max(max, num % 10);
            num /= 10;
        }
        return max;
    }
}

public class MaxPairSum {
    public static void main(String[] args) {
        int[] nums = {51,71,17,24,42};
        Solution sol = new Solution();
        int ans = sol.maxSum(nums);
        System.out.println(ans);
    }
}