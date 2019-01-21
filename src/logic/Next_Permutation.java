package logic;

import java.util.Arrays;
//31. Next Permutation
public class Next_Permutation {
    public static void main(String[] args) {
        int[] data = {1,2};
        nextPermutation(data);
        for (int i:data)
            System.out.println(i);
    }
    public static void nextPermutation(int[] nums) {
        int arr_length = nums.length;
        int max_place=arr_length-1;
        int min_place = arr_length-1;
        while(max_place>0){
            if(nums[max_place]>nums[max_place-1]){
                break;
            }
            --max_place;
        }
        //check
        if(max_place<=0){
            Arrays.sort(nums);
            return;
        }
        --max_place;
        while(min_place>max_place){
            if(nums[min_place]>nums[max_place]){

                break;
            }
            min_place--;
        }
        System.out.println(max_place+" "+min_place);
        swap(max_place,min_place,nums);
        int j = 1;
        for (int i = max_place+1; i <arr_length; i++) {
            if(i>=arr_length-j){
                break;
            }
            swap(i,arr_length-j,nums);
            j++;
        }


    }
    public static void swap(int first,int seond,int[] nums){
        int temp = nums[first];
        nums[first] = nums[seond];
        nums[seond] = temp;
    }
}
