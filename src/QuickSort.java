/*
* https://www.cnblogs.com/foreverking/articles/2234225.html
* */
public class QuickSort {

    public static void main(String[] args) {
        int[] data = {2,8,9,5,6};
        quickSort(data,0,4);
        for(int item : data){
            System.out.println(item);
        }

    }
    public static int partition(int[] data,int left,int right){
        int i = left;
        int j = right;
        int temp = data[left];
        while(i<j){
            while((i<j)&&(data[j]>=temp)){
                j--;
            }
            data[i] = data[j];
            while((i<j)&&(data[i]<=temp)){
                i++;
            }
            data[j] = data[i];
        }
        data[j] = temp;
        return j;
    }
    public static void quickSort(int[] data,int left,int right){
        if(left>=right){
            return;
        }
        int index= partition(data,left,right);
        quickSort(data,left,index);
        quickSort(data,index+1,right);
    }
}
