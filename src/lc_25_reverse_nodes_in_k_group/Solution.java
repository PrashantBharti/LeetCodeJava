package lc_25_reverse_nodes_in_k_group;

import java.util.Objects;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 0)
            return null;

        ListNode resHead = new ListNode(0);
        ListNode resTail = resHead;
        while (head != null) {
            ListNode first = head;
            ListNode second = findKthNode(first, k);

            if (Objects.isNull(second)) {
                head = null;
                resTail.next = first;
            } else {
                head = second.next;

                second.next = null;
                reverse(first);
                resTail.next = second;
                resTail = first;
            }
        }

        return resHead.next;
    }

    private ListNode findKthNode(ListNode head, int k) {
        while (k > 1 && head != null) {
            head = head.next;
            k--;
        }

        return head;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}

/*
1 -> 2 -> 3 ->
 */