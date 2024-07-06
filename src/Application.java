import lc_23_merge_k_sorted_lists.Solution;
import lc_23_merge_k_sorted_lists.ListNode;

import java.util.List;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        ListNode n11 = new ListNode(1);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(5);
        n11.next = n2;
        n2.next = n3;

        ListNode n21 = new ListNode(1);
        n2 = new ListNode(3);
        n3 = new ListNode(4);
        n21.next = n2;
        n2.next = n3;

        ListNode n31 = new ListNode(2);
        n2 = new ListNode(6);
        n31.next = n2;

        ListNode[] arr = {n11, n21, n31};
        ListNode merged = solution.mergeKLists(arr);

        while (merged != null) {
            System.out.println(merged.val);
            merged = merged.next;
        }
    }
}
