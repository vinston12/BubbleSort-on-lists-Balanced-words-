package Balanced;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class BalancedWordsCounterTest {

    @Test
    public void testValidString(){
        // This word is not a balanced string by its definition because there is a 4*a, 4*b and 3*c
        // input = aabbabcccba
        // result = 28
        String input = "aabbabcccba";
        var expectedResult = 3;
        var actualResult = BalancedWordsCounter.count(input);
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testInvalidString(){
        // input = dlwldaldgvbfd
        // result = 0
        String input = "dlwldaldgvbfd";
        var expectedResult = 0;
        var actualResult = BalancedWordsCounter.count(input);
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testEmptyString(){
        // input = ""
        // result = 0
        String input = "";
        var expectedResult = 0;
        var actualResult = BalancedWordsCounter.count(input);
        assertEquals(expectedResult,actualResult);

    }
    @Test(expected = RuntimeException.class)
    public void testOtherCharacter(){
        // input = abababa1
        String input = "abababa1";
        var expectedResult = RuntimeException.class;
        var actualResult = BalancedWordsCounter.count(input);
        assertEquals(expectedResult,actualResult);

    }
    @Test(expected = RuntimeException.class)
    public void testSort_nullInput(){
        // input = null
        // result = RuntimeException *
        BalancedWordsCounter.count(null);
    }

}
