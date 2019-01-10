import java.util.HashMap;

public class House_Robber {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(test(s));
//        int[] nums = {2,7,9,3,1};
//        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int result =  0;
        int h_length  = nums.length;
        int[][] dp = new int[h_length+1][2];
        for (int i = 1; i <=h_length; i++) {
            dp[i][0] = dp[i-1][1]+nums[i-1];
            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][1]);
        }
        return Math.max(dp[h_length][0],dp[h_length][1]);
    }
    public static int test(String s){
        if(s==null||s.length()==0){
            return 0;
        }
        int left = -1;
        int gMax = 0;
        int slength = s.length();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<slength;i++){
            if((map.containsKey(s.charAt(i)))&&(map.get(s.charAt(i))>=left))
                left = map.get(s.charAt(i));
            map.put(s.charAt(i),i);
            System.out.println(s.charAt(i)+"  "+i+"  "+left+"  "+(i-left+1));
            gMax = Math.max(gMax,i-left);
        }
        return gMax;
    }
}
