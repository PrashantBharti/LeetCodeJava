package lc_21_merge_two_sorted_lists;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode mergedHead = null;
        ListNode mergeTail = mergedHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (mergeTail == null) {
                    mergeTail = list1;
                    mergedHead = mergeTail;
                }
                else {
                    mergeTail.next = list1;
                    mergeTail = mergeTail.next;
                }

                list1 = list1.next;
                mergeTail.next = null;
            } else if (list2.val < list1.val) {
                if (mergeTail == null) {
                    mergeTail = list2;
                    mergedHead = mergeTail;
                }
                else {
                    mergeTail.next = list2;
                    mergeTail = mergeTail.next;
                }

                list2 = list2.next;
                mergeTail.next = null;
            } else {
                if (mergeTail == null) {
                    mergeTail = list1;
                    mergedHead = mergeTail;
                }
                else {
                    mergeTail.next = list1;
                    mergeTail = mergeTail.next;
                }

                list1 = list1.next;
                mergeTail.next = list2;
                list2 = list2.next;
                mergeTail = mergeTail.next;
                mergeTail.next = null;
            }
        }

        if (list1 != null) {
            mergeTail.next = list1;
        } else {
            mergeTail.next = list2;
        }

        return mergedHead;
    }
}
