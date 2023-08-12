package com.company;
import java.util.Date;
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String G = null;
        String DATA = "No";
        System.out.print("Enter a String data: ");
        String S = sc.nextLine();
        if( S != null){
            for (int i=0; i<S.length(); i++) {
                if(G == null) G = String.valueOf(S.charAt(i));
                for (int j = 0; j < G.length(); j++) {
                    if(G.charAt(j) == S.charAt(i)){ DATA = "Yes"; break; }
                }
                if(DATA == "No" && i != 0) G += String.valueOf(S.charAt(i)); else DATA = "No";
            }
        }
        System.out.println(G.length());
    }
}
