package arrays;

import java.util.Arrays;
import java.util.List;

public class Triangle_120 {
    public static void main(String[] args) {

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int max_length = triangle.get(triangle.size()-1).size();
        int[] dp = new int[max_length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = triangle.get(0).get(0);
        int pre_val = 0;
        for (int i = 1; i < triangle.size(); i++) {
            List list  = triangle.get(i);
            for (int j = 0; j < list.size(); j++) {
                if(j==0){
                    pre_val=dp[0];
                    dp[0] += (int)list.get(j);

                }else{
                    int temp = dp[j];
                    dp[j] = Math.min(dp[j],pre_val)+(int)list.get(j);
                    pre_val = temp;
                }
            }
        }
        int minPath = Integer.MAX_VALUE;
        for (int item:dp){
            minPath = minPath>item?item:minPath;
        }
        return minPath;
    }
}
