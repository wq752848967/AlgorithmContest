package logic;

public class kmp {

    public static int[] getNext(String s){
        char[] char_s=  s.toCharArray();
        int[] next = new int[s.length()];
        int j=0;
        int k=-1;
        while(j<s.length()-1){
            if(k==-1||char_s[j]==char_s[k]){
                next[++j] = ++k;
            }else{
                k = next[k];
            }
        }
        return next;
    }
}

