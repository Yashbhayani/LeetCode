package com.company;

import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int IN) {

        String D ="";
        boolean IsNGValue = false;
        if(IN < 0){
            IsNGValue = true;
            D += "-";
        }

        if(IsNGValue){
            String S = String.valueOf(IN);
                for(int i=S.length()-1; i>0; i--){
                    if(S.charAt(i) == '0' && i == S.length()-1) {
                    }else {
                        D += S.charAt(i);
                    }
            }
        }else {
            String S = String.valueOf(IN);
            for(int i=S.length()-1; i>=0; i--){
                if(S.charAt(i) == '0' && i == S.length()-1) {
                }else {
                    D += S.charAt(i);
                }
            }
        }
        int D_W = Integer.parseInt(D);
        return D_W;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a input: ");
        Integer IN = sc.nextInt();
        System.out.println(reverse(IN));

    }
}
