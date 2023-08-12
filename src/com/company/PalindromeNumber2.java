package com.company;

import java.util.Scanner;

public class PalindromeNumber2 {
    public static Boolean isPalindrome(int x) {
        try {
            if (x < 0) {
                return false;
            }
            String k = "";
            for (int i = String.valueOf(x).length() - 1; i >= 0; i--) {
                k += String.valueOf(x).charAt(i);
            }
            return x == Integer.parseInt(k);
        } catch (Exception e) {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number :- ");
            Integer x = sc.nextInt();
            System.out.println(isPalindrome(x));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
