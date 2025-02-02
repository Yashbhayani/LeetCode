package com.company;

import java.util.Scanner;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainString = "()[]{}";

        System.out.println("Enter String:");
        String userInput = scanner.nextLine();
        int val = 0;
        if(userInput.length()%2 !=0){
            System.out.println(false);
        }else {
                for(int i=0; i<userInput.length();i++){
                char currentChar = userInput.charAt(i);
                int index = mainString.indexOf(currentChar);
                if (index == -1) {
                    System.out.println(false);
                    break;
                }else{
                    if(i%2 ==0){
                        val = index;
                        val++;
                    }else {
                        if(index == val){
                            val = 0;
                            if(i==userInput.length()-1){
                                System.out.println(true);
                            }
                        }else {
                            System.out.println(false);
                            break;
                        }
                    }
                }
            }
        }
    }
}
