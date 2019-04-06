import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 10;
        nums[1] = 2;
        largestNumber(nums);
    }
    public static  String largestNumber(int[] nums) {
        String[] s_data = new String[nums.length];
        for (int i=0;i<nums.length;i++){
            s_data[i] = nums[i]+"";
        }
        Arrays.sort(s_data);
//         Arrays.sort(s_data, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (o2+o1).compareTo(o1+o2);
//            }
//        });
        String result = "";
        for (int i = 0; i <nums.length; i++) {
            result+=s_data[i];
            System.out.println(s_data[i]);
        }
        return result;

    }

}

