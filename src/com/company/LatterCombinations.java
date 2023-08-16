package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LatterCombinations {
    private static void findCombinations(List<String> combinations, String N, StringBuilder previous, int index, String[] lettersAndNumbersMappings) {

        if (index == N.length()) {
            combinations.add(previous.toString());
            return;
        }

        String letters = lettersAndNumbersMappings[N.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            findCombinations(combinations, N, previous.append(c), index + 1, lettersAndNumbersMappings);
            previous.deleteCharAt(previous.length() - 1);
        }
    }
    public static List<String> LetterCombination(String N) {
        List<String> combinations = new ArrayList<>();

        if (N == null || N.isEmpty()) {
            return combinations;
        }

        String[] lettersAndNumbersMappings = new String[]{
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        findCombinations(combinations, N, new StringBuilder(), 0, lettersAndNumbersMappings);
        return combinations;
    }



    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        String phone_number = sd.nextLine();
        List<String> result = LetterCombination(phone_number);
        System.out.println(result);
    }
}
