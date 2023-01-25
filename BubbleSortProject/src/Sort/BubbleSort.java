package Sort;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BubbleSort {
    private BubbleSort() {
    }
    public static <T extends Number & Comparable<Object>> List<T> sort(List<T> input)  throws RuntimeException {

        if (input == null) {
            throw new RuntimeException("RuntimeException");
        } else {
            input = input.stream().filter(Objects::nonNull).collect(Collectors.toList());
                // simple bubblesort
            for (int i = 0; i < input.size(); i++) {
                for (int j = 0; j < input.size() - i - 1; j++) {
                    if (input.get(j) != null &&
                            input.get(j+1) != null &&
                            // casting every number to double, then comparing
                            Double.compare((input.get(j)).doubleValue(), (input.get(j+1)).doubleValue()) > 0)
                    {
                        T temp = input.get(j);
                        input.set(j, input.get(j + 1));
                        input.set(j + 1, temp);
                    }
                }
            }
        }

        return input;
    }
}