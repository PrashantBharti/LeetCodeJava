import lc_2_addtwonumbers.ListNode;
import lc_2_addtwonumbers.Solution;

class Application {
    public static void main(String[] args) {
        ListNode l1Head = new ListNode(2);
        ListNode l1Tail = l1Head;
        l1Tail.next = new ListNode(4);
        l1Tail = l1Tail.next;
        l1Tail.next = new ListNode(3);
        l1Tail = l1Tail.next;

        ListNode l2Head = new ListNode(5);
        ListNode l2Tail = l2Head;
        l2Tail.next = new ListNode(6);
        l2Tail = l2Tail.next;

        final Solution solution = new Solution();
        ListNode ans = solution.addTwoNumbers(l1Head, l2Head);

        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
