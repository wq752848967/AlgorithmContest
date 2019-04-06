package arrays;

import java.util.HashMap;

public class Degree_of_an_Array_697 {
    public static void main(String[] args) {

    }
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        //先找到最大度
        HashMap<Integer,Integer> h_degree  = new HashMap<>();
        int degree = 1;
        for(int item:nums){
            if(h_degree.containsKey(item)){
                int pre_degree = h_degree.get(item);
                if((pre_degree+1)>degree){
                    degree  = pre_degree+1;
                }
                h_degree.put(item,pre_degree+1);
            }else{
                h_degree.put(item,1);

            }
        }

        //寻找最小distance
        HashMap<Integer,Integer> start = new HashMap<>();
        HashMap<Integer,Integer> end = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int item = nums[i];
            if(h_degree.get(item)==degree){
                if(start.containsKey(item)){
                    end.put(item,i);
                }else{
                    start.put(item,i);
                }

            }
        }
        int minDistance = Integer.MAX_VALUE;
        for (int key:start.keySet()){
            int end_index= start.get(key);
            if(end.containsKey(key)){
                end_index = end.get(key);
            }
            int new_distance = end_index-start.get(key);
            minDistance = new_distance<minDistance?new_distance:minDistance;
        }
        return minDistance+1;
    }
}
