import java.util.*;

public class removeInvalidParentheses {
    public static void main(String[] args) {

        //set  treeset会默认排序   hashset   LinkedHashSet会保存插入的顺序
        //queue  linklist
        String data  = "(()";
        //System.out.println(isValid("(())()"));
        System.out.println(removeInvalidParentheses.removeInvalidParentheses(data).size());
    }
    public static List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        Queue<String> myStack = new LinkedList<String>();
        Set<String> visited = new HashSet<String>();
        boolean addResult = false;
        int maxLength = 0;
        myStack.add(s);
        while(!myStack.isEmpty()){
            String cur_s  = myStack.poll();
            System.out.println(cur_s+" isva:"+isValid(cur_s));

            if((addResult)&&(cur_s.length()<maxLength)){
                break;
            }
            if(isValid(cur_s)){
                System.out.println("insert:"+cur_s);
                result.add(cur_s);
                if(!addResult){
                    addResult = true;
                    maxLength = cur_s.length();
                }
            }else{
                for (int i = 0; i < cur_s.length(); i++) {

                    if(cur_s.charAt(i)!=')'&&cur_s.charAt(i)!='('){

                        continue;
                    }
                    String new_s = cur_s.substring(0,i)+cur_s.substring(i+1);
                    System.out.println(i+" add:"+new_s);
                    if(!visited.contains(new_s)){

                        myStack.offer(new_s);
                        visited.add(new_s);
                    }

                }
            }
        }
        return result;
    }
    public static boolean isValid(String s){
        int cnt = 0;
        for(char c:s.toCharArray()){
            if (c == '(') ++cnt;
            else if (c == ')' && --cnt < 0) return false;
        }
        return cnt==0;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(10, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode n1, ListNode n2) {
                return n1.val - n2.val;
            }
        });
        for (int i = 0; i < lists.length; i++) {
            ListNode node = lists[i];
            if (node != null) {
                heap.offer(node);
            }
        }
        ListNode head = null;
        ListNode pre = head;
        while (heap.size() > 0) {
            ListNode cur = heap.poll();
            if (head == null) {
                head = cur;
                pre = head;
            } else {
                pre.next = cur;
            }
            pre = cur;
            if (cur.next != null)
                heap.offer(cur.next);
        }
        return head;
    }


}

