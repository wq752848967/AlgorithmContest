/*
* https://www.cnblogs.com/foreverking/articles/2234225.html
* https://blog.csdn.net/adusts/article/details/80882649
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
    public static int partition2(int[] data,int left,int right){
        int i = left;
        int j = right;
        int temp = data[left];
        while(i<j){
            while(i<j&&data[j]>=temp){
                j--;
            }
            while(i<j&&data[i]<=temp){
                i--;
            }
            if(i<j){
                int t = data[i];
                data[i] = data[j];
                data[j] = t;
            }

        }
        data[left] = data[i];
        data[i] = temp;
        return i;
    }
    public static void quickSort2(int[] data,int left,int right){
        int p = 0;
        while(left<right){
            p = partition2(data,left,right);
            quickSort2(data,left,p-1);
            quickSort2(data,p+1,right);
        }
    }
}
