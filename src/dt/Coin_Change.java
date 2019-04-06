package dt;

import java.util.Arrays;

public class Coin_Change {
    public static void main(String[] args) {
        int[] data={1};
        System.out.println(coinChange(data,1));
    }
    public static int coinChange(int[] coins, int amount) {
        int min_count = -1;
        if(amount==0){
            return 0;
        }
        Arrays.sort(coins);
        int c_length = coins.length;
        int[] dp =new int[amount+1];
        Arrays.fill(dp,999);
        dp[0] = 0;
        for (int j = c_length-1; j >=0; j--) {
            for (int i = coins[j]; i <=amount; i++) {
                dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
            }

        }
        return dp[amount]!=999?dp[amount]:-1;

    }
}
