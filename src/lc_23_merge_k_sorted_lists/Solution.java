package lc_23_merge_k_sorted_lists;

import java.util.Comparator;
import java.util.PriorityQueue;

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class NodeComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair o1, Pair o2) {
        int x = o1.x - o2.x;
        int y = o1.y - o2.y;

        return x != 0 ? x : y;
    }
}

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        final PriorityQueue<Pair> pq = new PriorityQueue<>(new NodeComparator());
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                ListNode head = lists[i];
                pq.offer(new Pair(head.val, i));
            }
        }

        ListNode mergedHead = new ListNode(-1);
        ListNode mergedTail = mergedHead;
        while (!pq.isEmpty()) {
            Pair pr = pq.poll();
            mergedTail.next = lists[pr.y];
            mergedTail = mergedTail.next;

            lists[pr.y] = lists[pr.y].next;
            mergedTail.next = null;

            if (lists[pr.y] != null) {
                pq.offer(new Pair(lists[pr.y].val, pr.y));
            }
        }

        return mergedHead.next;
    }
}
