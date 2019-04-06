package CoderInterviewBook;

import java.util.Arrays;
import java.util.Comparator;

public class MaxDictString {
    public static void main(String[] args) {


        Arrays.sort(args,new MyComparator());
    }
    static class MyComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {

            return (o1+o2).compareTo(o2+o1);
        }
    }
}
