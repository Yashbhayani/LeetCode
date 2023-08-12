package com.company;

import java.util.*;

public class ContainerWithMostWater2 {
    public static int Findvalue(int[] Array) {
        ArrayList<Integer> list=new ArrayList<Integer>();
       for (int i=0; i<((Array.length%2 == 0) ? Array.length/2 : ((int)(Array.length/2)+1));i++){
            for(int j = Array.length-1; j>((Array.length%2 == 0) ? (Array.length/2)-1 : Array.length/2); j--) {
            int DD = Math.min(Array[i], Array[j]) * (j-i);
            list.add(DD);
            }
       }
        list.sort(Comparator.reverseOrder());
        return list.get(0);
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
