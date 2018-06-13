package info.everybodylies.ocp8.stream;

import java.util.stream.Stream;

public class Generate {
    public static void main(String[] args) {
        Stream.generate(() -> new User("UserName")).limit(10).forEach(System.out::println);
    }
}
