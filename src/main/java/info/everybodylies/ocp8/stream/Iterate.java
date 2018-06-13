package info.everybodylies.ocp8.stream;

import java.util.stream.Stream;

public class Iterate {
    public static void main(String[] args) {
        Stream
                .iterate(new User("UserName"), u -> new User(u.getName() + "!"))
                .limit(5)
                .forEach(System.out::println);
    }
}
