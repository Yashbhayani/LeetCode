package com.company;
import java.util.*;

public class PermutationsofStrings1 {
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
        String[] val = {"ab","bc","cd", "de"};
        getPermutations(val);
    }
}
