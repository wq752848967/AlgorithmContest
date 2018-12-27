public class Reverse_Linked_List {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode(-1);
        newHead.next = null;
        ListNode next = head;
        while(next!=null){
            ListNode temp = next.next;
            next.next = newHead.next;
            newHead.next = next;
            next = temp;

        }
        return newHead.next;
    }
    public ListNode reverseList2(ListNode head) {
       //687. Longest Univalue Path (Easy)
        //337. House Robber III (Medium)
        //637. Average of Levels in Binary Tree (Easy)
        //669. Trim a Binary Search Tree (Easy)
        //Convert BST to Greater Tree (Easy)
    }
}
