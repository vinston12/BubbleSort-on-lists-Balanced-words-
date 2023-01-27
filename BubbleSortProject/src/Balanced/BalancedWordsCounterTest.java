package Balanced;

import Balanced.BalancedWordsCounter;

class BalancedWordsCounterTest {
    public static void main(String[] args) {
        BalancedWordsCounter counter = new BalancedWordsCounter();
        try {
            System.out.println(counter.count("aabbabcccba")); // should print 28
            System.out.println(counter.count("")); // should print 0
            System.out.println(counter.count("abababa1")); // should throw Exception
            System.out.println(counter.count(null)); // should throw Exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}