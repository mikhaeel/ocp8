package info.everybodylies.ocp8.stream;

import java.util.stream.Stream;

public class AllMatch {

    public static void main(String[] args) {
        boolean result = Stream.empty().allMatch(o -> true);
        System.out.println("result = " + result);
        Stream<Object> su = Stream.builder().add(new User("name")).add(new User("Mike")).build();
        result = su.map(o -> (User)o).allMatch(u -> ((User) u).getName().equals("Mike"));
        System.out.println("result is " + result);
    }

}
