package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkdList {
    public static int addTwoNumbers(LinkedList List_1, LinkedList List_2) {

        String A = null;
        String AA = null;

        for(int i=List_1.size()-1; i>=0; i--){
            String s=String.valueOf(List_1.get(i));
            if(A == null) A = s; else A += s;
        }

        for(int i= List_2.size()-1; i>=0; i--){
            String s=String.valueOf(List_2.get(i));
            if(AA == null) AA = s; else AA += s;
        }

        int A_1, AA_1;
        A_1 = Integer.parseInt(A);
        AA_1 = Integer.parseInt(AA);

        System.out.println(A_1 + AA_1);
        return 0;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a first List size: ");
        int List_size_1 = sc.nextInt();

        System.out.print("Enter a Second List size: ");
        int List_size_2 = sc.nextInt();

        LinkedList<Integer> List_1=new LinkedList<Integer>();
        LinkedList<Integer> List_2=new LinkedList<Integer>();


        for(int i=0; i<List_size_1; i++) {
            System.out.println("Enter a Array item:- ");
            List_1.add(sc.nextInt());
        }

        for(int i=0; i<List_size_2; i++) {
            System.out.println("Enter a Array item:- ");
            List_2.add(sc.nextInt());
        }

        addTwoNumbers(List_1, List_2);
    }
}
