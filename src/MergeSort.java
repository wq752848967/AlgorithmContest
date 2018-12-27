public class MergeSort {
    public static void main(String[] args) {

    }
    public static  void mergeSort(int[] data,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            mergeSort(data,low,mid);
            mergeSort(data,low+1,high);
            merge(data,low,mid,high);
        }
    }
    public static void merge(int[] data,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int k=0;
        int i=low;
        int j=mid+1;
        while((i<=mid)&&(j<=high)){
            if(data[i]<data[j]){
                temp[k++] =  data[i++];
            }else{
                temp[k++] =  data[j++];
            }
        }
        while(i<=mid){
            temp[k++] =  data[i++];
        }
        while(j<=high){
            temp[k++] =  data[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            data[low+l] = temp[l];
        }
    }
}
