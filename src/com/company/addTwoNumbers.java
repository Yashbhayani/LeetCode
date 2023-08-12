package com.company;
import java.util.Scanner;

public class addTwoNumbers {
    public static int addTwoNumbers(int[] Array_1, int[] Array_2) {

        String A = null;
        String AA = null;

        for(int i=Array_1.length-1; i>=0; i--){
            String s=String.valueOf(Array_1[i]);
            if(A == null) A = s; else A += s;
        }

        for(int i=Array_2.length-1; i>=0; i--){
            String s=String.valueOf(Array_2[i]);
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

        System.out.print("Enter a first Array size: ");
        int Array_size_1 = sc.nextInt();

        System.out.print("Enter a Second Array size: ");
        int Array_size_2 = sc.nextInt();

        int[] Array_1 = new int[Array_size_1];
        int[] Array_2 = new int[Array_size_1];

            for(int i=0; i<Array_size_1; i++) {
                System.out.println("Enter a Array item:- ");
                Array_1[i] = sc.nextInt();
            }

            for(int i=0; i<Array_size_2; i++) {
                System.out.println("Enter a Array item:- ");
                Array_2[i] = sc.nextInt();
            }

        addTwoNumbers(Array_1, Array_2);
    }
}
