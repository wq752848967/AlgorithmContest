import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Course_Schedule {
    //207. Course Schedule
    public static void main(String[] args) {
        int[][] data = {{1,0}};
        System.out.println(canFinish(2,data));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean result = true;
        int courseSize = prerequisites.length;
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i <numCourses ; i++) {
            graph[i] = new ArrayList<>();
        }
        Queue<Integer> que = new PriorityQueue<>();
        Integer[] in = new Integer[numCourses];
        Arrays.fill(in,0);
        for (int[] item:prerequisites){

            ++in[item[0]];

            graph[item[1]].add(item[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if(in[i]==0){
                que.add(i);
            }
        }
        while(!que.isEmpty()){
            int t  = que.poll();
            for(int pre:graph[t]){
                --in[pre];
                if(in[pre]==0){
                    que.add(pre);
                }
            }
        }
        for (int item : in){
            if(item>0){
                return false;
            }
        }


        return result;
    }
}
