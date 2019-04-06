public class Regular_Expression_Matching {
    public static void main(String[] args) {
        boolean[][] dp = new boolean[2][2];
        System.out.println(dp[0][0]);
    }
    public static  boolean isMatch(String s, String p) {
        char[] arr_s = s.toCharArray();
        char[] arr_p = p.toCharArray();
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];

        dp[0][0] = true;
        for (int i = 1; i <=s.length() ; i++) {
            for (int j = 1; j <=p.length() ; j++) {


                if(p.charAt(j-1) == '.' || s.charAt(i-1) == p.charAt(j-1)) dp[i][j] = dp[i-1][j-1];

                else if(p.charAt(j-1) == '*'){

                    if(j != 1 && (p.charAt(j-2) != '.' && s.charAt(i-1) != p.charAt(j-2)))
                        dp[i][j] = dp[i][j-2];
                    else
                        dp[i][j] = dp[i][j-2] || dp[i][j-1] || dp[i-1][j];
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
