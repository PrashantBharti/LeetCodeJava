package lc_19_nth_node_from_end_of_list;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;

        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }

        int idx = length - n + 1;
        if (idx <= 0 || idx > length)
            return head;

        if (idx == 1) {
            cur = head.next;
            head.next = null;
            head = cur;
        } else {
            cur = head;
            while (idx > 2) {
                cur = cur.next;
                idx--;
            }

            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = null;
        }

        return head;
    }
}
