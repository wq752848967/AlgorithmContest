import java.util.ArrayList;
import java.util.List;

public class Permutation_2 {
    public static void main(String[] args) {
        int[] data = {1,1,2};
        List<List<Integer>> result  = permuteUnique(data);
        for (List<Integer> item:result){
            for (Integer v:item){
                System.out.print(v+" ");
            }
            System.out.println(" ");
        }
    }
    public static  List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0){
            return result;
        }

        dfsPermuteUnique(0,result,nums);
        return result;
    }
    public static void dfsPermuteUnique(int index, List<List<Integer>> result,int[] nums){
        if(index==nums.length){
            List<Integer> sques = new ArrayList<Integer>();
            for(int item:nums){
                sques.add(item);
            }
            result.add(sques);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if(index!=i&&nums[index]==nums[i]){
                continue;
            }
            swap(index,i,nums);
            dfsPermuteUnique(index+1,result,nums);
            swap(i,index,nums);
        }

    }
    public static void swap(int index,int i,int[] nums){
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }

}
