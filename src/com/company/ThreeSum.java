package com.company;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int arraySize = sc.nextInt();

        int[] arr = new int[arraySize];
        List<List<Integer>> triplets = new ArrayList<>();
        Set<List<Integer>> seenTriplets = new HashSet<>();

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < arraySize - 2; i++) {
            for (int j = i + 1; j < arraySize - 1; j++) {
                for (int k = j + 1; k < arraySize; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        if (!seenTriplets.contains(triplet)) {
                            triplets.add(triplet);
                            seenTriplets.add(triplet);
                        }
                    }
                }
            }
        }

        System.out.println("Triplets with sum zero: ");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
        }
}
