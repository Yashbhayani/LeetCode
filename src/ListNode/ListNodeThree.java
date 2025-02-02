package ListNode;
import java.util.PriorityQueue;

public class ListNodeThree {

    int val;
    ListNode next;

    public ListNodeThree(int val) {
        this.val = val;
        next = null;
    }

    private ListNode createList(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public ListNode NewList(ListNode[] head) {
        ListNode soluction = new ListNode(0);
        ListNode dummy = soluction;

        for (ListNode list : head) {
            while (list != null) {
                if (dummy.next != null) {
                    dummy.next = list;
                    dummy = dummy.next;
                    list = list.next;
                } else {
                    dummy.next = list;
                    dummy = dummy.next;
                    list = list.next;
                }
            }
        }

        return soluction.next;
    }


    public ListNode MergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        while (!minHeap.isEmpty()) {
            ListNode minNode = minHeap.poll();
            if (minNode.next != null)
                minHeap.offer(minNode.next);
            curr.next = minNode;
            curr = curr.next;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        ListNodeThree solution = new ListNodeThree(0);

        ListNode list1 = solution.createList(new int[]{1, 4, 5});
        ListNode list2 = solution.createList(new int[]{1, 3, 4});
        ListNode list3 = solution.createList(new int[]{2, 6});

        ListNode[] lists = {list1, list2, list3};
        ListNode mergeKLists = solution.MergeKLists(lists);
    }

    }
