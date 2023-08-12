package com.company;

import java.util.Scanner;

public class PalindromeNumber1 {
    public static boolean isPalindrome(int x) {
        int num = 0;
        int source = x;
        while(source!=0) {
            num = num * 10;
            int k = source%10;
            num+=k;
            source/=10;
        }
        return num == x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a input: ");
        Integer IN = sc.nextInt();

        System.out.println(isPalindrome(IN));
    }
}
