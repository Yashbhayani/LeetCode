package com.company;
import java.util.Scanner;

public class ZigzagConversion {
    public static int convert(String IN, int NR) {

        if (IN == null || IN.isEmpty() || NR <= 0) {
            return 0;
        }
        if (NR == 1) {
            System.out.println(IN);
        }else {
            String C = "";
            int YY = 2 * NR - 2;
            for (int i = 0; i < NR; i++) {
                for (int j = i; j < IN.length(); j += YY) {
                    C += IN.charAt(j);
                    if (i != 0 && i != NR - 1 && (j + YY - 2 * i) < IN.length()) {
                        C += IN.charAt(j + YY - 2 * i);
                    }
                }
            }
            System.out.println(C);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a input: ");
        String IN = sc.nextLine();

        System.out.println("Enter number of row: ");
        int NR = sc.nextInt();

        convert(IN,NR);
    }
}
