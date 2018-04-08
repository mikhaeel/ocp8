package info.everybodylies.ocp8;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntReduce {
    public static void main(String[] args) {
        simpleIntReduce();
        identityReduce();
    }

    private static void identityReduce() {
        IntStream is = IntStream.range(1, 5);
        int result = is.reduce(0, (left, right) -> left + right);
        System.out.println(result);
    }

    private static void simpleIntReduce() {
        IntStream is = IntStream.range(1, 5);
        OptionalInt result = is.reduce((left, right) -> left + right);
        System.out.println(result.orElse(0));
    }
}
