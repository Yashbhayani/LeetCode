package com.company;
import java.util.Scanner;

public class ZigzagConversion3 {
    public static String convert(String s, int numRows) {

        int index = 0;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i = 0; i<numRows; i++) {
            sb[i] = new StringBuffer();
        }
        while(index<s.length()) {
            for(int i = 0; i<numRows&&index<s.length(); i++) {
                sb[i].append(s.charAt(index));
                index++;
            }
            for(int i=numRows-2; i>0&&index<s.length(); i--) {
                sb[i].append(s.charAt(index));
                index++;
            }
        }

        for(int i = 1; i<numRows; i++) {
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a input: ");
        String IN = sc.nextLine();

        System.out.println("Enter number of row: ");
        int NR = sc.nextInt();

        String ANS = convert(IN,  NR);
        System.out.println("Result is " + ANS);
    }
}
