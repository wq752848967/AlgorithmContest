public class Package_3 {
    public static void main(String[] args){

    }
    //https://www.cnblogs.com/fengziwei/p/7750849.html
    public static int package_01(int n,int m,int[] weight,int[] value){
        int[] dp = new int[m+1];
        for (int i = 0; i < n; i++) {
            for (int j = m; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j],dp[j-weight[i]]+value[i]);
            }
        }
        return dp[m];
    }
    public static int package_full(int n,int m,int[] weight,int[] value){
        int[] dp = new int[m+1];
        for (int i = 0; i < n; i++) {
            for (int j = weight[i]; j <= m; j++) {
                dp[j] = Math.max(dp[j],dp[j-weight[i]]+value[i]);
            }
        }
        return dp[m];
    }
    //多重背包问题，两种解决方案：https://blog.csdn.net/na_beginning/article/details/62884939
    //未完待续
}

