import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int index = nums.length - 1;

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare){
                result[index] = leftSquare;
                left++;
            }else{
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}

public class SortedSquares {
    public static void main() {
        int[] nums = {-4,-1,0,3,10};
        Solution solution = new Solution();
        int[] sol = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(sol));
    }
}