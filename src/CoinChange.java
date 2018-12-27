import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins={2};
        System.out.println(coinChange(coins,3));
    }
    public static int coinChange(int[] coins, int amount) {
        if((coins==null)||(coins.length==0)||(amount<=0)){
            return 0;
        }
        int c_size = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i = 0; i < c_size; i++) {
            for (int j = coins[i]; j <=amount; j++) {
                dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }

        return dp[amount]>amount?-1:dp[amount];
    }
}
