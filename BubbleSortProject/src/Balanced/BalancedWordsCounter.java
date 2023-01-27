package Balanced;

import java.util.*;

public class BalancedWordsCounter {

    public int count(String input) throws Exception {
        if (input == null) {
            throw new Exception("Input cannot be null");
        }

        if (!input.matches("[a-zA-Z]+")) {
            throw new Exception("Input must contain only letters");
        }

        if (input.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String subWord = input.substring(i, j);
                if (isBalanced(subWord)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isBalanced(String word) {
        int[] letters = new int[26];
        for (char c : word.toCharArray()) {
            letters[c - 'a']++;
        }
        int count = letters[word.charAt(0) - 'a'];
        for (int letterCount : letters) {
            if (letterCount != 0 && letterCount != count) {
                return false;
            }
        }
        return true;
    }

}
