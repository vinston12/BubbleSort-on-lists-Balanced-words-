package Balanced;

import java.util.*;

public class BalancedWordsCounter {

    public static int count(String input) throws RuntimeException {
        int result = 0;
        // exceptions check
        if (input == null) {
            throw new RuntimeException("RuntimeException *");
        } else if (input.equals("")) {
            return 0;
        } else {
            char[] ch = input.toCharArray();
            for (char c : ch) {
                if (Character.isDigit(c)) {
                    throw new RuntimeException("RuntimeException");
                }
            }
        }

        if (hasSameCharacterAmount(input)) {

        }
        return result;
    }
    // this method is checking if the amount of charaters is the same
    private static boolean hasSameCharacterAmount(String input){
        HashMap<Character,Integer> lettersCounterMap = new HashMap<>();
        int valueCount = 0;

        for (char c: input.toCharArray()) {
            if (lettersCounterMap.containsKey(c)){
                lettersCounterMap.put(c,lettersCounterMap.get(c)+1);
            }else{
                lettersCounterMap.put(c,1);
            }
        }
        Map.Entry<Character,Integer> entry = lettersCounterMap.entrySet().iterator().next();
        Integer val = entry.getValue();

        for (Integer i: lettersCounterMap.values()) {
            if (val.equals(i)){
                valueCount++;
            }
        }
        return lettersCounterMap.size() == valueCount;
    }

}
