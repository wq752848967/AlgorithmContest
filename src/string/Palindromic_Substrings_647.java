package string;

public class Palindromic_Substrings_647 {
    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
    public static int countSubstrings(String s) {
        int count_sum = 1;
        int n = s.length();
        char[] arr_char = s.toCharArray();
        for (int i = 0; i < n-1; i++) {
            count_sum+=findPalindromic(arr_char,""+arr_char[i],i,i,n);
            count_sum+=findPalindromic(arr_char,"",i,i+1,n);
            //System.out.println("i:"+i+"  "+count_sum);
        }
        return count_sum;
    }
    public static int findPalindromic(char[] arr_char,String s_init,int left,int right,int n){
        int count = 0;
        if(s_init.length()>=1){
            count++;
        }

        if(left==right){
            left--;
            right++;
        }
        while((left>-1)&&(right<n)){
            if(arr_char[left]==arr_char[right]){
                count++;
                if(left==0||right==n-1){
                    break;
                }
                left--;
                right++;

            }else{
                return count;
            }
        }
        return count;
    }
}
