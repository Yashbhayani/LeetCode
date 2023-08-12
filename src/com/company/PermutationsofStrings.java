package com.company;
import java.util.Scanner;

public class PermutationsofStrings {
    public static void main(String[] args) {
        String a[]={"ab","bc","cd"};
        int L = a.length;
        for(int i=0; i<L;){
            for(int j=0; j<L-1;){
                for(int K=0; K<L; K++) {
                    System.out.print(a[K]);
                    System.out.print(" ");
                }
                System.out.println("\n");
                j++;
                if(j<L-1) {
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            i++;
            if(i<L) {
                String temp = a[1];
                a[1] = a[0];
                a[0] = temp;
            }
        }
    }
}


/*
     String a[]={"ab","bc","cd"};
        int L = a.length;
        int fact = 1;
        int count =0, swap = L-1;

        for(int i=0; i<L; i++){
            fact += fact*i;
        }

        for(int i=0; i<L; i++){
            for(int j=0; j<fact/L; j++){
                for(int k =0; k<L; k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
                if(count == 0){
                    String temp = a[swap-1];
                    a[swap-1] = a[swap];
                    a[swap] = temp;
                    swap--;
                    count = 1;
                }else {
                    String temp = a[swap-1];
                    a[swap-1] = a[swap];
                    a[swap] = temp;
                    count = 0;
                    swap++;
                }
            }
        }
*/