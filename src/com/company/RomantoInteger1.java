package com.company;

import java.util.Scanner;

public class RomantoInteger1 {
    public static Integer romanToInt(String s) {
        int  HH = 0;
        int N[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String M[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int k= M.length;
        int S = 0;
        int L = 0;
        String KK;
        int sl = s.length();
            for (int i = 0; i < k; ) {
                L = i;
                KK = s.substring(S, S + 2);
                if ((String) KK == (String) M[i]) {
                        HH += N[i];
                        System.out.println(HH);
                        i++;
                    }
                    if (L == i) {
                        KK = s.substring(S, S + 1);
                        if ((String) KK == (String) M[i]) {
                            HH += N[i];
                            System.out.println(HH);
                            i++;
                        }else {
                            i++;
                        }
                    }
                }
        return HH;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a input: ");
//        String IN = sc.toString();
        romanToInt("MCMXCIV");

    }
}
