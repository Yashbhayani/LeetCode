package com.company;

import java.util.Scanner;

public class ReverseInteger2 {
    public static int reverse(int IN) {
        boolean isNegative = false;
        if (IN < 0) {
            isNegative = true;
            IN = -IN;
        }
        long reverse = 0;
        while (IN > 0) {
            reverse = reverse * 10 + IN % 10;
            IN /= 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reverse : reverse);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a input: ");
        Integer IN = sc.nextInt();
        System.out.println(reverse(IN));

    }
}
