public class productExceptSelf {
    public static void main(String[] args) {
        int[] data = {1,2,3,4};
        productExceptSelf(data);
    }
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] first_section = new int[length];
        int[] end_section = new int[length];
        int[] result = new int[length];
        int cnt = 1;
        for(int i=0;i<length-1;i++){
            first_section[i+1] = cnt*nums[i];
            cnt = cnt*nums[i];
        }

        first_section[0] = 1;

        cnt=1;
        for(int i=length-1;i>0;i--){

            end_section[i-1] = cnt*nums[i];
            cnt = cnt*nums[i];

        }
        end_section[length-1] = 1;

        for(int i=0;i<length;i++){
            result[i] = first_section[i]*end_section[i];
        }

        return result;
    }
}
