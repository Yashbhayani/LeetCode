package com.company;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class MedianofTwoSort {

    public static double findMedianSortedArrays(double[] Array_1, double[] Array_2) {

        double[] new_Array = new double[Array_1.length + Array_2.length];
        int j = 0;
        for (double element : Array_1){ new_Array[j] = element; j++; }
        for (double element : Array_2) { new_Array[j] = element; j++; }
        j = 0; int i =0;
        for (double element : new_Array) { i += element; j++; }
        Arrays.sort(new_Array);
        double K =  (double) i/ (double)new_Array.length;
        System.out.println(MessageFormat.format("merged array = {0} and median is {1} .",Arrays.toString(new_Array), K));

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Array 1 size: ");
        int Array_1_size = sc.nextInt();

        System.out.print("Enter a Array 2 size: ");
        int Array_2_size = sc.nextInt();

        double[] Array_1 = new double[Array_1_size];
        double[] Array_2 = new double[Array_2_size];

        for(int i=0; i<Array_1_size; i++) {
            System.out.println("Enter a Array item:- ");
            Array_1[i] = sc.nextDouble();
        }
        for(int i=0; i<Array_2_size; i++) {
            System.out.println("Enter a Array item:- ");
            Array_2[i] = sc.nextDouble();
        }

        findMedianSortedArrays(Array_1, Array_2);
    }
}
