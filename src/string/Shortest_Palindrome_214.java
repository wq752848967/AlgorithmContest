package string;

public class Shortest_Palindrome_214 {
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("abcd"));
    }
    public static String shortestPalindrome(String s) {
        int n = s.length();
        char [] arr_char = s.toCharArray();
        int i=n-1;

        for(i=n-1;i>=0;i--){
            if(isPalindrome(arr_char,0,i)){
                break;
            }
        }
        if(i<0){
            return new StringBuilder(s).reverse().toString()+s;
        }else{
            String result =  "";

            for(int j=n-1;j>i;j--){
                result+=arr_char[j];
            }
            result+=s;
            return result;
        }

    }
    public static boolean isPalindrome(char[] data,int start,int end){
        boolean result  = true;
        while(start<=end){
            if(data[start]==data[end]){
                start++;
                end--;
            }else{
                result = false;
                break;
            }
        }
        return result;
    }
}
