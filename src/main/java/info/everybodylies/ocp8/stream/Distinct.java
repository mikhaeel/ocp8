package info.everybodylies.ocp8.stream;

import java.util.stream.Stream;

public class Distinct {

    public static void main(String[] args) {
        Stream.Builder<User> sb = Stream.builder();
        Stream<User> su = sb.add(new User("Name")).add(new User("Mike")).add(new User("Mike")).build();
        System.out.println("Stream content:");
        su.forEach(System.out::println);
        System.out.println("After stream distinct: ");
        sb = Stream.builder();
        su = sb.add(new User("Name")).add(new User("Mike")).add(new User("Mike")).build();
        su.distinct().forEach(System.out::println);
    }
}
