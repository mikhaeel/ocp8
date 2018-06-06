package info.everybodylies.ocp8.stream;

import java.util.stream.Stream;

public class Concat {

    public static void main(String[] args) {
        Stream<User> su = Stream.<User>builder().add(new User("Name")).add(new User("Mike")).build();
        Stream<User> su2 = Stream.<User>builder().add(new User("Name2")).add(new User("Mike2")).build();
        Stream.concat(su, su2).forEach(System.out::println);
    }
}
