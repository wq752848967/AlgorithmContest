import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String s = "applepenapple";
        String[] words = {"apple","pen"};
        System.out.println(wordBreak(s,Arrays.asList(words)));

    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        int s_length = s.length();
        Boolean[] dp = new Boolean[s_length+1];
        Arrays.fill(dp,false);
        dp[0] = true;
        for (int i = 1; i <=s_length; i++) {
            for(String word:wordDict){
               // System.out.println((word.length()<=(i))+" "+(i-word.length())+" "+word.length()+"  "+i);
                if((word.length()<=(i))&&(word.equals(s.substring(i-word.length(),i)))){
                    dp[i] = dp[i-word.length()]||dp[i];
                }
            }
        }
        return dp[s_length];
    }


}
