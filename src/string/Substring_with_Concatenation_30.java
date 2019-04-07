package string;

import java.util.*;

public class Substring_with_Concatenation_30 {
    public static void main(String[] args) {


        String[] words = {"word","good","best","good"};
        String s =  "wordgoodgoodgoodbestword";
        System.out.println(findSubstring(s,words).size());
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        if(words.length==0){
            return Collections.emptyList();
        }
        List<Integer> result_list = new ArrayList<>();
        int m = words[0].length();
        int n = s.length();
        int wind_length = words.length*m;
        HashMap<String,Integer> words_set = new HashMap<>();
        for(String word:words){
            if(words_set.containsKey(word)){
                words_set.put(word,words_set.get(word)+1);
                continue;
            }
            words_set.put(word,1);
        }
        for (int i = 0; i < n-wind_length+1; i++) {
            HashMap<String,Integer>  word_count = new HashMap<>();
            int count = 0;
            for (int j = 0; j <words.length; j++) {
                String com_word = s.substring(i+j*m,i+(j+1)*m);
                if((!words_set.containsKey(com_word))){
                    break;
                }
                if(word_count.containsKey(com_word)){
                    int cur_count = word_count.get(com_word);
                    if(cur_count==words_set.get(com_word)){
                        break;
                    }else{
                        word_count.put(com_word,cur_count+1);
                    }
                }else{
                    word_count.put(com_word,1);
                }

                count++;

            }
            if(count==words.length){
                result_list.add(i);
            }
        }
        return result_list;
    }
}
