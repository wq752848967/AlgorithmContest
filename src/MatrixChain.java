public class MatrixChain {
    public static void main(String[] args) {

    }
    public static void matrixChain(int[] p,int n,int[][] s){
        int[][] dp = new int[n-1][n-1];
        for (int i = 0; i < n-1; i++) {
            dp[i][i] = 0;
            
        }

        for (int r = 2; r <n; r++) {
            for (int i = 0; i <n-r; i++) {
                int j = i+r-1;
                dp[i][j] = Integer.MIN_VALUE;
                for (int k = 0; k < j; k++) {
                    int temp = dp[i][k]+p[i]*p[i+1]*p[j];
                    if(temp>dp[i][j]){
                        dp[i][j] = temp;
                        s[i][j] = k;
                    }
                }
            }
        }
            
    }
    public static void Display(int[][] s, String name, int i, int j)
    {
        if(i == j)
        {
            System.out.print(name.charAt(i));
        }
        else
        {
            System.out.print("(");
            Display(s, name, i, s[i][j]);
            Display(s, name, s[i][j]+1, j);
            System.out.print(")");
        }
    }
}
