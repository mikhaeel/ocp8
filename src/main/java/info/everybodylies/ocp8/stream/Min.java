package info.everybodylies.ocp8.stream;

import java.util.Optional;

public class Min {
    public static void main(String[] args) {
        Optional<User> max = UserStreamBuilder.getUserStream(5).min(User::compareTo);
        max.ifPresent(System.out::println);
    }
}
