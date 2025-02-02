package com.company;

public class SwapNodesinPairs6 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListNode createList(int[] values) {
        ListNode head = null, current = null;

        for (int value : values) {
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
                current = head;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }
        return head;
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = head;
        while (head != null && head.next != null){
            int fi = head.val;
            head.val = head.next.val;
            head.next.val = fi;
            head = head.next.next;
        }
        return  dummy;
    }

    public static void main(String[] args) {
        SwapNodesinPairs6 solution = new SwapNodesinPairs6();
        int[] values = {1, 4, 5, 3, 5};

        ListNode newList = solution.createList(values);

        System.out.println("Original List:");
        solution.printList(newList);

        ListNode swappedList = solution.swapPairs(newList);

        System.out.println("List After Swapping Pairs:");
        solution.printList(swappedList);
    }
}
