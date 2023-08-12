package com.company;
import java.util.Scanner;

public class Main {

    public static int twoSum(int[] Array, int target) {

        for(int i=0; i<Array.length; i++){
            for(int j=1; j<Array.length-1; j++){
                if(Array[i] + Array[j] == target){
                    System.out.println(" [ " + i + ", " + j + " ]");
                    break;
                }
            }
        }

        return target;
    }

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Array size: ");
        int Array_size = sc.nextInt();

        System.out.print("Enter a Target: ");
        int target = sc.nextInt();

        int[] Array = new int[Array_size];

        for(int i=0; i<Array_size; i++) {
            System.out.println("Enter a Array item:- ");
            Array[i] = sc.nextInt();
        }

        target = twoSum(Array, target);
    }
}
