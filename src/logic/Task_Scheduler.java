package logic;

public class Task_Scheduler {
    public static void main(String[] args) {
        char[] data = {'A','A','A','B','B','B'};
        System.out.println(leastInterval(data,2));
    }
    public static int leastInterval(char[] tasks, int n) {
        char[] cnt = new char[26];
        int mx=0;
        int mx_cnt = 0;
        for (char c:tasks){
            ++cnt[c-'A'];
            if(mx==cnt[c-'A']){
                mx_cnt++;
            }
            else if(mx<cnt[c-'A']){
                mx=cnt[c-'A'];
                mx_cnt=1;
            }
        }
        int partCnt = mx-1;
        int partLeft = n-(mx_cnt-1);
        int emptyLeft = partCnt*partLeft;
        int idel = Math.max(0,emptyLeft-(tasks.length-mx*mx_cnt));
        return tasks.length+idel;
    }
}
