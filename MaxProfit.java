class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int left = 0;//1
        int right = 1;//4

        while(right < prices.length){
            if(prices[right] > prices[left]){
                int potentialProfit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, potentialProfit);
            }else{
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}

public class MaxProfit {
    public static void main() {
        int[] prices = {7,1,2,6,4};
        Solution sol = new Solution();
        int ans = sol.maxProfit(prices);
        System.out.println(ans);
    }
}