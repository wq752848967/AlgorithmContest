public class Longest_Palindromic_Subsequence_516 {
    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("bbbab"));
    }
    public static int longestPalindromeSubseq(String s) {
        int i_s_length = s.length();
        int[][] dp = new int[i_s_length][i_s_length];
        for (int i = 0; i < i_s_length; i++) {
            dp[i][i]  = 1;
        }
        for (int i = i_s_length-1; i >=0; i--) {
            for (int j = i+1; j <i_s_length; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1]+2;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
                }
            }
        }



        return dp[0][i_s_length-1];

    }
}
