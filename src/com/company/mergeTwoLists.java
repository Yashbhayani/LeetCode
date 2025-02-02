package com.company;

import java.util.Scanner;

public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Test your implementation
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}



/*
import java.util.*;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();

        while (list1 != null) {
            linkedList1.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            linkedList2.add(list2.val);
            list2 = list2.next;
        }

        linkedList1.addAll(linkedList2);

        Collections.sort(linkedList1);

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : linkedList1) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }
}
*/