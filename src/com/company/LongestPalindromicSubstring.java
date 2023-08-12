package com.company;
import java.util.*;
import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static int check(String S, int L) {

        Set<String> data;
        data = new LinkedHashSet<String>();
        for(int i=0; i<L-2; i++){
            try {
                int j = i;
                char A = S.charAt(j);
                char B = S.charAt(j+1);
                char C = S.charAt(j+2);

                while (A == B && j<L-1){
                    data.add(A+""+B);
                    j++;
                    A = S.charAt(j);
                    B = S.charAt(j+1);
                }

                while (A == C && j<L-2){
                    data.add(A+""+B+""+C);
                    j++;
                    A = S.charAt(j);
                    B = S.charAt(j+1);
                    C = S.charAt(j+2);
                }

            }catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println(data);

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Value:- ");
        String S = sc.nextLine();
        check(S, S.length());
    }
}
