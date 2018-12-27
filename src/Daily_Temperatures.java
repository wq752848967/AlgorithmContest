import java.util.Stack;

public class Daily_Temperatures {
    public static void main(String[] args) {
        int[] data={73, 74, 75, 71, 69, 72, 76, 73};
        for(int i:dailyTemperatures(data)){
            System.out.print(i+"  ");
        }

    }
    public static int[] dailyTemperatures(int[] T) {
        if(T==null||T.length==0){
            return null;
        }
        int[] result = new int[T.length];
        Stack<Integer> stack = new Stack();
        for (int i = 0;i<T.length;i++){
            while((!stack.empty())&&(T[i]>T[stack.peek()])){
                int preIndex= stack.pop();
                result[preIndex] = i-preIndex;
            }
            stack.push(i);
        }
        return result;
    }
}
