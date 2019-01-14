import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a_3Sum {
    public static void main(String[] args) {
        int[] nums = {1,-1,-1,0};

        System.out.println(threeSum(nums).size());
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println("1");
        List<List<Integer>> result = new ArrayList();
        if(nums==null||nums.length==0||nums[0]>0){
            return result;
        }
        System.out.println(nums[2]+" "+nums[3]);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                break;
            }
            if(i>0&&nums[i] == nums[i-1]){
                continue;
            }
            int k = i+1;int j=nums.length-1;
            while(k<j){

                if((nums[i]+nums[k]+nums[j]==0)){
                    Integer[] items = {nums[i],nums[k],nums[j]};

                    List<Integer> item_list = Arrays.asList(items);
                    result.add(item_list);
                    while((k<j)&&(nums[k] == nums[k+1])) ++k;
                    while((k<j)&&(nums[j] == nums[j-1])) --j;
                    ++k;
                    --j;
                }
                else if((nums[k]+nums[j]+nums[i]<0)){
                    ++k;
                }else{
                    --j;
                }
            }
        }
        return result;
    }

}
