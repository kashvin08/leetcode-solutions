import java.util.*; // using 2 pointers

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length - 1;
        while (a < b) {
            int sum = numbers[a] + numbers[b];
            if (sum > target) {
                b--;
            } else if (sum < target) {
                a++;
            } else {
                return new int[]{a + 1, b + 1};
            }
        }
        return new int[]{a+1, b+1};
    }
}

public class TwoSumII{
    public static void main(String[] args){
        int[] numbers = {2,4,7,12};
        int target = 19;
        Solution sol = new Solution();
        int[] ans = sol.twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }
}
