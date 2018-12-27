public class Sell_Stock_3 {

    /*
    * 最多交易两次
    * */
    public static void main(String[] args) {
        int[] data = {3,3,5,0,0,3,1,4,1};
        System.out.println(maxProfit(data));
    }
    public  static int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int firstBuy = Integer.MIN_VALUE;
        int firstSell = 0;
        int secondBuy = Integer.MIN_VALUE;
        int secondSell = 0;
        for (int i = 0; i < prices.length; i++) {
            if(firstBuy<-prices[i]){
                firstBuy = -prices[i];
            }
            if(firstSell<(prices[i]+firstBuy)){
                firstSell = prices[i]+firstBuy;
            }
            if(secondBuy<(firstSell-prices[i])){
                secondBuy = firstSell-prices[i];
            }
            if(secondSell<(secondBuy+prices[i])){
                secondSell = secondBuy+prices[i];
            }

        }



        return secondSell;
    }

}
