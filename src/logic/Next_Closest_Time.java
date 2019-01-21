package logic;

import java.util.Set;
import java.util.TreeSet;

public class Next_Closest_Time {
    public static void main(String[] args) {
        System.out.println(nextClosestTime("22:37"));
    }
    public static String nextClosestTime(String time) {
        char[] res = time.toCharArray();
        Set<Character> c_Char = new TreeSet<Character>();
        for (Character c:res){
            if(c==':'){
                continue;

            }
            c_Char.add(c);
        }
        Character[] sort_res  =  new Character[c_Char.size()];
        c_Char.toArray(sort_res);
//        for (int i = 0; i < sort_res.length; i++) {
//            System.out.println(sort_res[i]+" ");
//        }


        for (int i = 4; i >=0; i--) {
            if(res[i]==':'){
                continue;
            }
            char cur_c = res[i];

            //find cur_c index in array
            int pos = 0;
            for (int j = 0; j < sort_res.length; j++) {
                if(cur_c==sort_res[j]){
                    pos=j;
                    break;
                }
            }
            System.out.println(cur_c+" "+pos);

            if(pos==sort_res.length-1){
                //max
                res[i] = sort_res[0];
            }else{
                char next =  sort_res[pos+1];
                if(i==4){
                    System.out.println("in 4");
                    res[i] = next;
                    return new String(res);
                }else if (i == 3 && next <= '5') {
                    System.out.println("in 3");
                    res[i] = next;
                    return new String(res);
                }else if(i==1&&(res[0]!='2'||(res[0]=='2'&&next<='3'))){
                    System.out.println("in 1");
                    res[i] = next;
                    return new String(res);
                }else if (i == 0 && next <= '2') {
                    System.out.println("in 0");
                    res[i] = next;
                    return new String(res);
                }
                res[i] = sort_res[0];
            }
        }
        return new String(res);

    }

}
