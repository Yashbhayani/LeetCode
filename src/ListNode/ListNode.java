package ListNode;
import java.util.PriorityQueue;

public class ListNode {
    int val;
    ListNode next;

    // Constructor
    ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode createList(int[][] values) {
        ListNode head = null, current = null;

        for (int[] list : values) {
            for (int value : list) {
                ListNode newNode = new ListNode(value);
                if (head == null) {
                    head = newNode;
                    current = head;
                } else {
                    current.next = newNode;
                    current = current.next;
                }
            }
        }
        return head;
    }

    public void printList() {
        ListNode current = this;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListNode shortList(ListNode head) {
        if (head == null) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        ListNode current = head;
        while (current != null) {
            pq.offer(current);
            current = current.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {
            tail.next = pq.poll();
            tail = tail.next;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode solution = new ListNode(0);
        int[][] values = {{1, 4, 5}, {3, 5, 6}, {1, 2, 8}};

        ListNode newList = solution.createList(values);
        newList.printList();

        ListNode shortNewList = solution.shortList(newList);
        shortNewList.printList();
    }
}
