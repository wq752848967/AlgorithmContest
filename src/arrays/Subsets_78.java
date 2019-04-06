package arrays;

import java.util.*;

public class Subsets_78 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        Queue<List<Integer>> queue = new LinkedList<List<Integer>>();
        List arr_empty = new ArrayList<Integer>();
        ((LinkedList<List<Integer>>) queue).push(arr_empty);
        for (int i = 0; i < n; i++) {
            int size = queue.size();
            for(int j=0;j<size;j++){
                List<Integer> items = ((LinkedList<List<Integer>>) queue).get(j);

               List<Integer> new_items = new ArrayList<>(items);
               new_items.add(nums[i]);
               ((LinkedList<List<Integer>>) queue).add(new_items);
            }
        }
        return (List<List<Integer>>) queue;
    }
}
