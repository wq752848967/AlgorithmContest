

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_2 {
    public static void main(String[] args) {
        int[] data={1,2,1};
        for(int i:nextGreaterElements(data)){
            System.out.print(i+"  ");
        }
    }
    public static int[] nextGreaterElements(int[] nums) {
        if(nums==null||nums.length==0){
            return new int[0];
        }
        int[] result = new int[nums.length];
        Arrays.fill(result,-1);
        Stack<Integer> stack = new Stack<Integer>();
        int n = nums.length;
        for (int i = 0; i < (n*2); i++) {
            int sig_i = i%n;

            while((!stack.empty())&&(nums[sig_i]>nums[stack.peek()])){
                int pre_Index = stack.pop();
                result[pre_Index] = nums[sig_i];
            }
            if(i<n){
                stack.push(i);
            }
        }
        return result;
    }
}
