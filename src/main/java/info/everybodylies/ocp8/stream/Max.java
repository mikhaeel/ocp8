package info.everybodylies.ocp8.stream;

import java.util.Optional;

public class Max {
    public static void main(String[] args) {
        Optional<User> max = UserStreamBuilder.getUserStream(5).max(User::compareTo);
        max.ifPresent(System.out::println);
    }
}
