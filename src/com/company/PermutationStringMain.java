package com.company;
import java.util.*;

public class PermutationStringMain {
    public static void getPermutations(String[] array){
        helper(array, 0);
    }
    private static void helper(String[] array, int pos){
        if(pos >= array.length - 1){
            System.out.print("[");
            for(int i = 0; i < array.length - 1; i++){
                System.out.print(array[i] + ", ");
            }
            if(array.length > 0)
                System.out.print(array[array.length - 1]);
            System.out.println("]");
            return;
        }

        for(int i = pos; i < array.length; i++){
            String t = array[pos];
            array[pos] = array[i];
            array[i] = t;

            helper(array, pos+1);

            t = array[pos];
            array[pos] = array[i];
            array[i] = t;
        }
    }
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Array Size: ");
        int L1 = sc.nextInt();

        String[] val = new String[L1];
        int A = 1;

        Scanner s=new Scanner(System.in);

        for(int i=0; i<L1; i++) {
            System.out.println("Enter a Array item:- ");
            val[i] = s.nextLine();
            A++;
        }

//        String[] val = {"ab","bc","cd", "de"};
       getPermutations(val);
    }
}
