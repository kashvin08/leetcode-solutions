class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int j = m - 1;
        int k = n - 1;
        while(j >= 0 && k >= 0){
            if(nums1[j] > nums2[k]){
                nums1[i] = nums1[j];
                i--;
                j--;
            }
            else{
                nums1[i] = nums2[k];
                i--;
                k--;
            }
        }
        while(k >= 0){
            nums1[i] = nums2[k];
            i--;
            k--;
        }
    }
}

public class MergeSortedArray{
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,3,4};
        Solution sol = new Solution();
        sol.merge(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}