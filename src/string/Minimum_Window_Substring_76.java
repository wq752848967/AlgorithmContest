package string;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_Substring_76 {
    public static void main(String[] args) {
        String s  =  "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }
    public static String minWindow(String s, String t) {
        int n = s.length();
        int left =0;
        int right = -1;
        Map<String,Integer> m_count = new HashMap<>();
        int i_count_sum = 0;
        String result =  null;
        while((left<n)&&(right<n)){
            if(i_count_sum<t.length()){
                right++;
                if(right<n){
                    if(!t.contains(s.substring(right,right+1))){
                        continue;
                    }
                    else if(m_count.containsKey(s.substring(right,right+1))){
                      m_count.put(s.substring(right,right+1),m_count.get(s.substring(right,right+1))+1);
                      continue;
                  } else{
                      i_count_sum++;
                      m_count.put(s.substring(right,right+1),1);
                  }
                }
            }else if(i_count_sum>t.length()){
                //err
            }else{
                String s_new_sub = s.substring(left,right+1);
                if((result==null)||(result.length()>s_new_sub.length())){
                    result = s_new_sub;
                }
                String s_move = s.substring(left,left+1);
                if(!t.contains(s_move)){
                    left++;
                    continue;
                }
                //System.out.println(left+ " "+s_move);
                int i_left_count = m_count.get(s_move);
                left++;
                if(i_left_count>1){
                    m_count.put(s_move,m_count.get(s_move)-1);
                }else{

                    m_count.remove(s_move);
                    i_count_sum--;
                }
            }
        }
        return result==null?"":result;
    }
}
