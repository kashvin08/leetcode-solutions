import java.util.*;

class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int areaMax = 0;

        while(left < right){
            int width = right - left;
            int containerHeight =  Math.min(height[left], height[right]);
            int currArea = width * containerHeight;

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            areaMax = Math.max(areaMax, currArea);
        }
        return areaMax;
    }
}

public class MostWater {
    public static void main() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Solution sol = new Solution();
        int ans = sol.maxArea(height);
        System.out.println(ans);
    }
}