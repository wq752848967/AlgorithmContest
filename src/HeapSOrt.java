public class HeapSOrt {
    public static void main(String[] args) {
        int[] data = new int[2];

    }

    public static void insertHear(int[] heap,int index){
        while(index!=0){
            int parent = (index-1)/2;
            if(heap[parent]<heap[index]){
                swap(heap,parent,index);
                index = parent;
            }else{
                break;
            }
        }
    }
    public static void heapfy(int[] heap,int index,int size){
        int left = index*2+1;
        int right = index*2+2;
        int larger = index;
        while(left<size){
            if(heap[index]<heap[left]){
                larger = left;
            }
            if(right<size&&heap[right]>heap[larger]){
                larger = right;
            }
            if(index!=larger){
                swap(heap,index,larger);
            }else{
                break;
            }
            index = larger;
            left = index*2+1;
            right = index*2+2;

        }
    }
    public static void swap(int[] heap,int parent,int index){

    }
}
