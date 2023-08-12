package com.company;

import java.util.Scanner;

public class IntegerToRoman2 {
    public static String Findvalue(String Data) {
        int DD =  Integer.parseInt(Data);
        String  HH = "";
        Integer[] M = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] C = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int k = M.length-1;
            for(int i = k; i>=0; i--){
                if(DD >= M[i]) {
                    int Do = DD / M[i];
                    for(int j = 1; j<=Do ;j++){
                        HH += C[i];
                    }
                    DD %= M[i];

                }
            }
        return HH;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Array size: ");
        String NN = sc.next();
        String F =Findvalue(NN);
        System.out.println(F);
    }
}
