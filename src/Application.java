import lc_25_reverse_nodes_in_k_group.Solution;
import lc_25_reverse_nodes_in_k_group.ListNode;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode res = solution.reverseKGroup(n1, 0);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
