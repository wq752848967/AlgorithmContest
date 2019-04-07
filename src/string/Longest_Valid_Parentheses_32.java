package string;

import java.util.Stack;

public class Longest_Valid_Parentheses_32 {
    public static void main(String[] args) {
        String data = ")()())";
        System.out.println(longestValidParentheses(data));
    }
    public static int longestValidParentheses(String s) {
        int max_length = 0;
        int n = s.length();
        int[] dp = new int[n];
        Stack<Integer> myStack = new Stack<>();
        char[] char_s = s.toCharArray();
        for(int i=0;i<n;i++){
            if(char_s[i]==')'){
                if(!myStack.empty()){
                    int index = myStack.pop();
                    dp[i] = i-index+1;
                    if(index-1>0){
                        dp[i]+=dp[index-1];
                    }
                    max_length=max_length<dp[i]?dp[i]:max_length;
                }
            }else{
                myStack.push(i);
            }
        }
        return max_length;
    }
}
