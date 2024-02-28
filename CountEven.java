import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CountEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = CountEven::isEven;
        long count = numbers.stream()
                .filter(isEven)
                .count();
        System.out.println(count);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
