class Solution {
    public int climbStairs(int n) {
                if (n <= 2) {
                    return n;
                }

                int twoStepsBelow = 1; // Ways to reach step 1
                int oneStepBelow = 2;  // Ways to reach step 2
                int currentStep = 0;

                for (int i = 3; i <= n; i++) {
                    currentStep = oneStepBelow + twoStepsBelow;//5

                    twoStepsBelow = oneStepBelow;//3
                    oneStepBelow = currentStep;//5
                }

                return oneStepBelow;
            }
        }

public class ClimbingStairs {
    public static void main() {
        int n = 4;
        Solution sol = new Solution();
        int ans = sol.climbStairs(n);
        System.out.println(ans);
    }
}