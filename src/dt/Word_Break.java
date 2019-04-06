package dt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Word_Break {
    public static void main(String[] args) {
        String s = "catsandog";
        String[] words =  {"cats","dog","sand","and","cat"};
        List<String> list =Arrays.asList(words);
        System.out.println(wordBreak(s,list));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        if(s==null){
            return true;
        }

        int[] dp  = new int[s.length()+1];
        dp[0] = 1;
        for(int i=1;i<=s.length();i++){
            for (String word : wordDict){
                if(i==8&& word=="code"){
                    System.out.println(dp[4]+" "+(dp[i-word.length()]==1));
                }
                if(i>=word.length()&&dp[i-word.length()]==1){
                    int new_state = contains(s,word,i-1)==true?1:0;
                    dp[i] = Math.max(dp[i],new_state);

                }
            }
        }
        //System.out.println(dp[5]);
        return dp[s.length()]==1?true:false;
    }
    public static boolean contains(String s,String word,int index){
        char[] arr_char =  s.toCharArray();
        char[] arr_word = word.toCharArray();
        int cur_index= index;
        for(int i=word.length()-1;i>=0;i--){
            if(arr_char[cur_index]!=arr_word[i]){
                return false;
            }
            cur_index--;
        }
        return true;
    }
}
