import java.util.Optional;
import java.util.function.Function;

public class Java230324 {
    public static void  main(String[] args){
        Function<String, String> toUpperCaseFunction = String::toUpperCase;
        Optional<String> optionalHello = Optional.of("hello");

        Optional<String> result = optionalHello.map(toUpperCaseFunction)
                .filter(s -> s.equals("HELLO"));

        System.out.println(result.isPresent());
    }
}
