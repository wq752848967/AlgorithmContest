package xiaomi_oj;

public class BurstBalloons {
    public static void main(String[] args) {
        int n=5;
        for (int len = 1; len <= n; ++len) {
            for (int left = 1; left <= n - len + 1; ++left) {
                int right = left + len - 1;

                    System.out.println(left+" "+right);

            }
        }

    }
    public static int maxCoins(int[] nums) {
        int[] nums_cat  = new int[nums.length+2];
        nums_cat[0] = 1;
        int n =  nums.length;
        nums_cat[nums.length+1] = 1;
        for (int i = 1; i <=nums.length; i++) {
            nums_cat[i] =  nums[i-1];
        }
        int[][] dp  = new int[n+2][n+2];
        for (int len = 1; len <=n; len++) {
            for (int left = 1; left <=n-len+1; left++) {
                int right = left + len - 1;
                for (int k = left; k <=right; k++) {
                    dp[left][right] = Math.max(dp[left][right], nums_cat[left - 1] * nums_cat[k] * nums_cat[right + 1] + dp[left][k - 1] + dp[k + 1][right]);

                }
            }
        }
        return dp[1][n];
    }
}
