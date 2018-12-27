import java.util.Map;

public class Sell_Stock_5 {
    public static void main(String[] args) {

    }
    public static int maxProfit(int k, int[] prices) {

        if(prices==null || prices.length<2){
            return 0;
        }
        int n = prices.length;
        if(k>(n/2)){
            return max(prices);
        }
        int[][] local = new int[n][k+1];
        int[][] global = new int[n][k+1];
        for (int t = 1; t <=k; t++) {
            for (int d = 1; d < n; d++) {
                int temp = prices[d]-prices[d-1];
                local[d][t] = Math.max(local[d-1][t]+temp,global[d-1][t-1]+Math.max(0,temp));
                global[d][t] = Math.max(global[d-1][t],local[d][t]);

            }
        }
        return global[n-1][k];

    }
    public static int max(int[] prices){
        int Profit = 0;
        for (int i = 1; i <prices.length ; i++) {
            if(prices[i]>prices[i-1]){
                Profit+=prices[i]-prices[i-1];
            }

        }
        return Profit;
    }
}
