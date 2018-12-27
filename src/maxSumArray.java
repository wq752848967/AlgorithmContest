public class maxSumArray {
    public static void main(String[] args) {

    }
    public static int maxSunArray(int[] data){
        if(data==null||data.length==0){
            return 0;
        }
        int sum=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if(max<0){
                max=data[i];
            }
            else{
                max+=data[i];
            }

            if(max>sum){
                sum=max;
            }
        }
        return max;
    }
}
