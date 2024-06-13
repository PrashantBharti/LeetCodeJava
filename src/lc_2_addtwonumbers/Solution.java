package lc_2_addtwonumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ansHead = null;
        ListNode ansTail = ansHead;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            ListNode temp = new ListNode(sum);
            if (ansHead == null) {
                ansHead = temp;
                ansTail = temp;
            } else {
                ansTail.next = temp;
                ansTail = temp;
            }
        }

        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            ansTail.next = temp;
            ansTail = temp;
        }

        return ansHead;
    }
}
