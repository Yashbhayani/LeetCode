package com.company;

import java.util.Scanner;

public class StringtoInteger {

    public static int myAtoi(String S){
        String SS = "";
        int I;
        try {
            for (char c : S.toCharArray()) {
                if ((c >= '0' && c <= '9') || c == ' ' || c == '+' || c == '-') {SS += c;} else {break;}
            }
            I = Integer.parseInt(SS.trim());
        }catch (Exception err){
            I = 0;
        }
        return I;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a input: ");
        String S = sc.nextLine();

        System.out.println(myAtoi(S));
    }
}
