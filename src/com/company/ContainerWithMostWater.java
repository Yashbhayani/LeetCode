package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class ContainerWithMostWater {
    public static int Findvalue(int[] Array) {
        int ANS = 0;
        int A = 0;
        int B = Array.length-1;

        while (A < B){
            int DD = Math.min(Array[B], Array[A]);
            ANS = Math.max(ANS, DD * (B-A));
            if(Array[A]<Array[B]){
                A++;
            }else {
                B--;
            }
        }

        System.out.println(ANS);
        return ANS;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Array size: ");
        int Array_size = sc.nextInt();

        int[] Array = new int[Array_size];

        for(int i=0; i<Array_size; i++) {
            System.out.println("Enter a Array item:- ");
            Array[i] = sc.nextInt();
        }

        int Data = Findvalue(Array);
        System.out.println(Data);
    }
}
