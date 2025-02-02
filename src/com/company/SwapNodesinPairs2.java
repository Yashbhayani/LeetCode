package com.company;

public class SwapNodesinPairs2 {

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


    public int length(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }


    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null && current.next != null) {
            ListNode first = current;
            ListNode second = current.next;


            first.next = second.next;
            second.next = first;
            prev.next = second;


            prev = first;
            current = first.next;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        SwapNodesinPairs2 solution = new SwapNodesinPairs2();
        int[][] values = {{1, 4, 5}, {3, 5, 6}, {1, 2, 8}};

        ListNode newList = solution.createList(values);

        System.out.println("Original List:");
        solution.printList(newList);

        ListNode swappedList = solution.swapPairs(newList);

        System.out.println("List After Swapping Pairs:");
        solution.printList(swappedList);
    }
}
