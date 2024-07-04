import lc_21_merge_two_sorted_lists.Solution;
import lc_21_merge_two_sorted_lists.ListNode;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        ListNode n1 = new ListNode(1);
        ListNode h1 = n1;
        //n1.next = new ListNode(2);
        //n1.next.next = new ListNode(3);

        ListNode n2 = new ListNode(2);
        ListNode h2 = n2;
        n2.next = new ListNode(2);
        n2.next.next = new ListNode(3);

        ListNode mh = solution.mergeTwoLists(h1, h2);
        System.out.println(mh.val);
    }
}
