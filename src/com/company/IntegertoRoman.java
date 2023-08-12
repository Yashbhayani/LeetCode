package com.company;

import java.util.Scanner;

public class IntegertoRoman {
    public static int ITR(String[] data, int[] Amount, int OUT) {
     String ANS = "";
     int OO = OUT;
        for(int i=Amount.length-1; i>=0; i--){
            if(OO/Amount[i] >= 1){
            for(int j=1; j<=(OO/Amount[i]); j++){
                ANS += data[i];
            }
            OO = OO %Amount[i];
            }
        }

        System.out.println(ANS);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String data[] = {"I","V","X","L","C","D","M"};
        int Amount[] = {1,5,10,50,100,500,1000};

        System.out.print("Enter a Amount: ");
        int OUT = sc.nextInt();
        ITR(data, Amount, OUT);
    }
}
