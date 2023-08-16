package com.company;

import java.util.*;

public class LatterCombinations2 {
    public static List<String> letterCom(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }

        String[] digitToLetters = {
                "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '2';
            int queueSize = queue.size();

            for (int j = 0; j < queueSize; j++) {
                String currentCombination = queue.poll();
                for (char letter : digitToLetters[digit].toCharArray()) {
                    queue.offer(currentCombination + letter);
                }
            }
        }

        while (!queue.isEmpty()) {
            combinations.add(queue.poll());
        }

        return combinations;
    }
    public static void main(String[] args){
        Scanner sd = new Scanner(System.in);
        String N  = sd.next();
        List<String> result = letterCom(N);
        System.out.println(result);
    }
}
