package ListNode;
import java.util.*;

public class ListNode2 {
    int val;
    ListNode next;

    ListNode2(int x) {
        val = x;
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

    public ListNode mergeKLists(ListNode[] head) {
        if (head == null || head.length == 0) {
            return null;
        }

        List<Integer> li = new ArrayList<>();

        for (ListNode list : head) {
            while (list != null) {
                li.add(list.val);
                list = list.next;
            }
        }

        Collections.sort(li);

        if (li.isEmpty()) {
            return null;
        }

        ListNode headd = new ListNode(li.get(0));
        ListNode current = headd;

        for (int i = 1; i < li.size(); i++) {
            current.next = new ListNode(li.get(i));
            current = current.next;
        }

        return headd;
    }


    public static void main(String[] args) {
        ListNode2 solution = new ListNode2(0);

        ListNode list1 = solution.createList(new int[]{1, 4, 5});
        ListNode list2 = solution.createList(new int[]{1, 3, 4});
        ListNode list3 = solution.createList(new int[]{2, 6});

        ListNode[] lists = {list1, list2, list3};
        ListNode mergedList = solution.mergeKLists(lists);

    }
}

