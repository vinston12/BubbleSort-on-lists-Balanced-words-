package Sort;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

    @Test
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void testSort_validInput() {
        // input = [1,4,5,6,8,3,8]
        // result = [1,3,4,5,6,8,8]
        var input = List.of(1,4,5,6,8,3,8);
        var expectedResult = List.of(1,3,4,5,6,8,8);
        var actualResult = BubbleSort.sort((List)input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void testSort_validDecimalInput(){
        // input = [-9.3,0.2,4,0.1,5,9]
        // result = [-9.3,0.1,0.2,4,5,9]
        var input = new ArrayList<Number>();
        input.add(-9.3);
        input.add(0.2);
        input.add(4);
        input.add(0.1);
        input.add(5);
        input.add(9);
        var expectedResult = List.of(-9.3,0.1,0.2,4,5,9);
        var actualResult = BubbleSort.sort((List)input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @SuppressWarnings({"unchecked"})
    public void testSort_emptyInput(){
        // input = []
        // result = []
        //empty array
        var input = Collections.EMPTY_LIST;
        var expectedResult = Collections.EMPTY_LIST;
        var actualResult = BubbleSort.sort(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void testSort_nullInput(){
        // input = [null,5.0001]
        // result = [5.0001]
        var input = Arrays.asList(null,5.0001);
        var expectedResult = List.of(5.0001);
        var actualResult = BubbleSort.sort((List)input);
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = RuntimeException.class)
    public void testSort_nullListInput(){
        // input = null
        // result = RuntimeException
        BubbleSort.sort(null);
    }

}

