package com.company;

import java.util.Scanner;

public class ContainerWithMostWater1 {
    public static int Findvalue(int[] Array) {
        int ANS = 0;
        int B = Array.length-1;

        for (int i=0; i<Array.length;){
            int DD = Math.min(Array[i], Array[B]);
            ANS = Math.max(ANS, DD * (B-i));
            if(Array[i]<Array[B]){
                i++;
            }else {
                B--;
            }
            if(i>B){
                break;
            }
        }
        return ANS;
    }
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Array size: ");
        int Array_size = sc.nextInt();

        int[] Array = new int[Array_size];

        for(int i=0; i<Array_size; i++) {
            System.out.println("Enter a Array item:- ");
            Array[i] = sc.nextInt();
        }
*/
        int Array[] = {1,8,6,2,5,4,8,3,7};
        int Data = Findvalue(Array);
        System.out.println(Data);
    }
}
