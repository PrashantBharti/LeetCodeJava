import lc_19_nth_node_from_end_of_list.Solution;
import lc_19_nth_node_from_end_of_list.ListNode;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode head = solution.removeNthFromEnd(n1, 5);
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
