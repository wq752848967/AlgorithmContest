import java.util.Arrays;
import java.util.Comparator;


//435. Non-overlapping Intervals (Medium)
public class Non_overlapping_Intervals {
    public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
     }
    public static void main(String[] args) {

    }

    public static int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals==null||intervals.length==0){
            return 0;
        }
        int interSize = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(o->o.end));
        int end_time = intervals[0].end;
        int cnt = 1;
        for (int i = 1; i < interSize; i++) {
            Interval inter = intervals[i];
            if(inter.start<end_time){
                continue;
            }
            cnt++;
            end_time = inter.end;
        }
        return interSize-cnt;
    }
}
