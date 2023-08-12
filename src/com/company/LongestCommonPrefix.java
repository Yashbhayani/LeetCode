package com.company;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Array Size:- ");
        int Array_size = sc.nextInt();

        String[] AS = new String[Array_size];

        for(int i=0; i<Array_size; i++) {
            AS[i] = sc.next();
        }
        if(AS.length != 0) {
            int MinL = AS[0].length();

            for (int i = 1; i < Array_size; i++) {
                if (MinL > AS[i].length()) {
                    MinL = AS[i].length();
                }
            }
            int K =0;
            String ANS = "";
            for (int i = 0; i < MinL; i++) {
                char C = AS[0].charAt(i);
                for (String str : AS) {
                    if (str.charAt(i) != C) {
                        K =1;
                    }
                }
                if(K==1){
                     break;
                }else {
                    ANS += C;
                }
            }
            System.out.println(ANS);
        }
     }
}
