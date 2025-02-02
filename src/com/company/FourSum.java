package com.company;

import java.util.*;

public class FourSum {
    public static ArrayList<ArrayList<Integer>> getInput() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        System.out.println("Enter array size:");
        int listSize = scanner.nextInt();

        System.out.println("Enter " + listSize + " integers:");
        for (int i = 0; i < listSize; i++) {
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers);
        for (int i = 0; i < listSize - 3; i++) {
            for (int j = i + 1; j < listSize - 2; j++) {
                int left = j + 1;
                int right = listSize - 1;
                while (left < right) {
                    int sum = numbers.get(i) + numbers.get(j) + numbers.get(left) + numbers.get(right);
                    if (sum == 0) {
                        ArrayList<Integer> quadruplet = new ArrayList<>();
                        quadruplet.add(numbers.get(i));
                        quadruplet.add(numbers.get(j));
                        quadruplet.add(numbers.get(left));
                        quadruplet.add(numbers.get(right));
                        result.add(quadruplet);
                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> quadruplets = getInput();
        System.out.println("Quadruplets: " + quadruplets);
    }
}
