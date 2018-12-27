public class Palindrome_Partitioning_132 {
    public static void main(String[] args) {
        System.out.println(minCut("aab"));;
    }
    public  static  int minCut(String s) {
        int i_s_length = s.length();
        Boolean[][] s_flag = new Boolean[i_s_length][i_s_length];
        int[] dp =  new int[i_s_length];
        System.out.println("2 "+dp[2]);
        for (int i = 0; i < i_s_length-1; i++) {
            dp[i] = i_s_length-i-1;

            for (int j = 0; j < i_s_length; j++) {
                s_flag[i][j] = false;

            }
        }

        for (int i = i_s_length-1; i >=0; i--) {
            for (int j = i+1; j < i_s_length; j++) {

                if(s.charAt(i)==s.charAt(j)&&((j-i==1)||(s_flag[i+1][j-1]))){
                    s_flag[i][j] = true;
                    dp[i] = Math.min(dp[i],dp[j+1]+1);

                }

            }
        }
        return dp[0];

    }
}
