package info.everybodylies.ocp8.stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAny {

    public static void main(String[] args) {
        System.out.println("Список элементов: ");
        Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);
        Optional<Integer> ou = Stream.of(1, 2, 3, 4, 5).findAny();
        if (ou.isPresent()) {
            System.out.println("findAny result is " + ou.get());
        } else {
            System.out.println("findAny result is empty");
        }
    }
}
