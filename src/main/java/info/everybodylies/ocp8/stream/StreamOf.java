package info.everybodylies.ocp8.stream;

import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).forEach(i -> System.out.println("StreamOf: " + i));
        Stream.of(1).forEach(i -> System.out.println("StreamOf single value: " + i));
    }
}
