package com.company;

public class permutation3 {
    public static void printdata(String[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    public static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void printpermutationdata(String[] a, int c){
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
        String[] a={"AB", "BC", "CD", "DA"};
        printpermutationdata(a, 0);
    }
}
