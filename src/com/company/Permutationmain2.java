package com.company;

public class Permutationmain2 {

    public static void printdata(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printpermutationdata(int[] a, int c){
        if(c == a.length-1){
            printdata(a);
        return;
        }

        for(int i=c; i<a.length; i++){
            swap(a, i, c);
            printpermutationdata(a, c+1);
            swap(a, i, c);
        }
    }

    public static void main(String[] args){
        int[] a={1,2,3,4};
        printpermutationdata(a, 0);
    }
}
