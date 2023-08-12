package com.company;
import java.text.MessageFormat;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestPalindromicSubstring2 {
    public static int check(String S, int L) {
int E = 0;
        Dictionary  data;
        data = new Hashtable();
            try {
                for(int i=0; i<L; i++) {
                    int j = i + 1;
                    int K = j + 1;
                    boolean Brake_Active = false;
                    char A = S.charAt(i);
                    char B = S.charAt(j);
                    char C = S.charAt(K);
                    String DD = "";

                    while (A == B && j < L) {
                        DD += A;
                        A = S.charAt(j);
                        j++;
                        if(L == j){ DD += A; data.put(DD, ++E);Brake_Active = true;break;}
                        B = S.charAt(j);
                        if (j == L) {DD += B;data.put(DD,++E); Brake_Active = true;break;}
                        if(A != B){ DD += A; i = j-1; data.put(DD, ++E); break;}
                    }

                    while (A == C && K < L){
                        DD += A+""+B;
                        A = S.charAt(K);
                        B = S.charAt(++K);
                        if(L == K+1){ DD += A; data.put(DD, ++E);Brake_Active = true;break;}
                        C = S.charAt(++K);
                        if (L == K) {DD += C;data.put(DD,++E); Brake_Active = true;break;}
                        if(A != C){ DD += A;data.put(DD, ++E); break;}
                    }
                    if (Brake_Active) {break;}
                }

            }catch (Exception e){

            }
        System.out.println(data);


        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Value:- ");
        String S = sc.nextLine();
        check(S, S.length());
    }
}
