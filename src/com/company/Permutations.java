package com.company;

public class Permutations {
    public static void main(String[] args) {
        String a[]={"ab","bc","cd"};
        int L = a.length, SA = a.length -1;
        int fact = 1;
        int count =0, swap = L-1, setup = 0;
        String[] Array_1 = new String[L];
        for(int i=0; i<L; i++){
            Array_1[i] = a[i];
            fact += fact*i;
        }

        try {
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < fact / L; j++) {
                    for (int k = 0; k < L; k++) {
                        System.out.print(a[k] + " ");
                    }
                    System.out.println();
                    if (count == 0) {
                        if(swap > 1) {
                            String temp = a[swap - 1];
                            a[swap - 1] = a[swap];
                            a[swap] = temp;
                            swap--;
                        }
                        count = 1;
                    } else if(count == 1) {
                        if(swap > 1) {
                            String temp = a[swap - 1];
                            a[swap - 1] = a[swap];
                            a[swap] = temp;
                        }
                        count = 0;
                        swap++;
                    }else {
                        if(SA != 0){
                            String temp = a[SA - 2];
                            a[SA - 2] = a[SA-1];
                            a[SA - 1] = temp;
                            SA--;
                        }else {
                            SA = a.length -1;
                        }
                        count = 0;
                    }

                }
                for (int k = 0; k < L; k++) {
                    a[k] = Array_1[k];
                }
                a[0] = Array_1[i + 1];
                a[i + 1] = Array_1[0];
            }
        }
        catch(Exception e) {
            }
    }
}
