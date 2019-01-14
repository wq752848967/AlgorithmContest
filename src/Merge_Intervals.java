import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {
     class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
    public static void main(String[] args) {
        String s = "aba";
        System.out.println();
    }
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();
        if(intervals==null||intervals.size()==0){
            return intervals;
        }
        Interval[] arr_intervals =  intervals.toArray(new Interval[intervals.size()]);
        Arrays.sort(arr_intervals,Comparator.comparingInt(o->o.start));

        Interval temp_inter = null;
        for (Interval inter : arr_intervals){
            if(temp_inter==null){
                temp_inter = new Interval();
                temp_inter.start = inter.start;
                temp_inter.end = inter.end;
                continue;
            }
            if(inter.start<=temp_inter.end){
                temp_inter.end = temp_inter.end<inter.end?inter.end:temp_inter.end;
            }
            else{
                result.add(temp_inter);
                temp_inter = new Interval();
                temp_inter.start = inter.start;
                temp_inter.end = inter.end;
            }
        }
        if(result.size()==0||result.get(result.size()-1).end!=temp_inter.end){
            result.add(temp_inter);
        }
        return result;
    }
}
