import java.util.*;
public class RandomNumbers {

      public static List<Integer> generateDistinctNumbers(int n, int lowerBound, int upperBound) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = lowerBound; i <= upperBound; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers.subList(0, n);
    }

 
}
