package info.everybodylies.ocp8.stream;

import java.util.stream.Stream;

public class AnyMatch {

    public static void main(String[] args) {
        boolean result = Stream.empty().anyMatch(o -> true);
        System.out.println("empty Stream anyMatch of true = " + result);
        Stream.Builder<User> sb = Stream.builder();
        Stream<User> su = sb.add(new User("Name")).add(new User("Mike")).build();
        result = su.anyMatch(u -> u.getName().equals("Name"));
        System.out.println("anyMatch of users predicate true result = " + result);

    }
}
