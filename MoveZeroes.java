import java.util.*;

class Solution{
        public void moveZeroes(int[] nums) {

            if (nums == null || nums.length <= 1) {
                return;
            }

            int left = 0;

            for(int right = 0; right < nums.length; right++){
                if (nums[right] != 0){
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                    left++;
                }
            }

            System.out.println(Arrays.toString(nums));
        }
    }

public class MoveZeroes {
    public static void main() {
        int[] nums = {12,0,1,2,0,3};
        Solution sol = new Solution();
        sol.moveZeroes(nums);
    }
}