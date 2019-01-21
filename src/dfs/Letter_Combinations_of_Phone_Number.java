package dfs;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_Phone_Number {
    public static void main(String[] args) {


    }
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits==null||digits.length()==0){
            return result;
        }
        String[] digMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder stringBuilder = new StringBuilder();
        dfs(digMap,result,stringBuilder,digits,0);
        return result;
    }
    public static void dfs(String[] digMap,List<String> result,StringBuilder stringBuilder,String digits,int index){
        if(index==digits.length()){
            result.add(stringBuilder.toString());
            return;
        }
        int num = Integer.parseInt(digits.charAt(index)+"");
        char[] digs = digMap[num].toCharArray();
        for (int i = 0; i < digs.length; i++) {
            stringBuilder.append(digs[i]);
            dfs(digMap,result,stringBuilder,digits,index+1);
            stringBuilder.delete(index,index+1);
        }
    }
}
