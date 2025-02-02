package com.company;

public class SwapNodesinPairs3 {
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

       while (prev.next != null && prev.next.next != null){
           ListNode fi =  prev.next;
           ListNode se = prev.next.next;

           fi.next = se.next;
           se.next = fi;

           prev.next =  se;
           prev = fi;
       }

        return dummy.next;
    }


    public static void main(String[] args) {
        SwapNodesinPairs3 solution = new SwapNodesinPairs3();
        int[] values = {1, 4, 5, 3, 5};

        ListNode newList = solution.createList(values);

        System.out.println("Original List:");
        solution.printList(newList);

        ListNode swappedList = solution.swapPairs(newList);

        System.out.println("List After Swapping Pairs:");
        solution.printList(swappedList);
    }
}
