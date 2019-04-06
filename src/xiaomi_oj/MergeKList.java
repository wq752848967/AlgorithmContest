package xiaomi_oj;

import java.util.Comparator;
import java.util.PriorityQueue;
class ListNode{
    int valve;
}
public class MergeKList {
    public static void main(String[] args) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(10, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.valve-o2.valve;
            }
        });

    }
}
