package com.company;

public class SwapNodesinPairs4 {
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
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode newtempnode  = temp;

        while (temp.next != null && temp.next.next != null){
            ListNode fi = temp.next;
            ListNode se = temp.next.next;
            temp.next = se;
            fi.next = se.next;
            se.next = fi;
            temp = fi;
        }
        return newtempnode.next;
    }

    public static void main(String[] args) {
        SwapNodesinPairs4 solution = new SwapNodesinPairs4();
        int[] values = {1, 4, 5, 3, 5};

        ListNode newList = solution.createList(values);

        System.out.println("Original List:");
        solution.printList(newList);

        ListNode swappedList = solution.swapPairs(newList);

        System.out.println("List After Swapping Pairs:");
        solution.printList(swappedList);
    }
}
