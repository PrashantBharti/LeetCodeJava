package lc_24_swap_nodes_in_pairs;

import java.util.Objects;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode resHead = new ListNode(0);
        ListNode resTail = resHead;
        while (!Objects.isNull(head)) {
            ListNode first = head;
            ListNode second = first.next;

            if (!Objects.isNull(second)) {
                head = second.next;

                second.next = first;
                first.next = null;

                resTail.next = second;
                resTail = first;
            } else {
                head = second;

                resTail.next = first;
                resTail = first;
            }
        }

        return resHead.next;
    }
}
